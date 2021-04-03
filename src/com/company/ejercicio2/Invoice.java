package com.company.ejercicio2;
import java.lang.reflect.Array;
import java.time.*;
import java.util.UUID;
import java.util.Arrays;


public class Invoice {
    private UUID idInvoice;
    private SaleItem[] items;
    private LocalDateTime date;
    private Client client;

    public Invoice(){
    }
    public Invoice(SaleItem[] items, Client client){
        this.idInvoice=UUID.randomUUID();
        this.items = items;
        this.date=LocalDateTime.now();
        this.client=client;
    }

    public UUID getIdInvoice() {
        return idInvoice;
    }

    public void setIdInvoice(UUID idInvoice) {
        this.idInvoice = idInvoice;
    }

    public SaleItem[] getItems() {
        return items;
    }

    public void setItems(SaleItem[] items) {
        this.items = items;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    //Metodo
    //Funcion Antes del punto E
    //public double totalPriceDiscount() {
    //return totalPrice - client.getDiscount();
    //}
    public double getTotalPriceDiscount(){
        double TotalPrice = 0;
        for (SaleItem saleitem:items) {
            if (items!=null) {
            TotalPrice += saleitem.getTotal();
            }
        }
        return TotalPrice - (TotalPrice * (client.getDiscount()/100));
    }

    public double getTotalPrice(){
        double TotalPrice = 0;
        for (SaleItem saleitem:items) {
            if (items!=null) {
            TotalPrice += saleitem.getTotal();
            }
        }
        return TotalPrice;
    }


    public String toPrintInvoice(){
        String texto = "Factura: \n [ID: " + this.idInvoice.toString().substring(0,13).toUpperCase() +
                       " Fecha: " + this.date + " |Monto Total " + getTotalPrice() + " | Monto Total con Descuento " +
                        getTotalPriceDiscount()+ "] \n" + client.toPrintClient() + "\n Items: \n";

        for (SaleItem saleItem: items) {
            texto += saleItem.toPrintSaleItem();
        }
        return  texto;
    }

}
