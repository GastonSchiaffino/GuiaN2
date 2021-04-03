package com.company.ejercicio2;
import java.util.UUID;

public class SaleItem {
    private UUID idSaleItem;
    private String name;
    private String description;
    private double unitPrice;
    private int amount;

    public SaleItem(){
    }

    public SaleItem(String name, String description, double unitPrice,int amount){
        this.idSaleItem = UUID.randomUUID();
        this.name = name;
        this.description = description;
        this.unitPrice = unitPrice;
        this.amount = amount;
    }

    public UUID getIdSaleItem() {
        return idSaleItem;
    }

    public void setIdSaleItem(UUID idSaleItem) {
        this.idSaleItem = idSaleItem;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public double getTotal(){
        return this.amount * this.unitPrice;
    }

    public String toPrintSaleItem(){

        return "Item: [ID: " + this.idSaleItem.toString().toUpperCase().substring(0,5) +
                " |Nombre: " + this.name + " |Descripcion: " + this.description +
                " |Precio Unitario: " + this.unitPrice + " |Cantidad: " + this.amount + "]\n";
    }
}
