package com.company.ejercicio2;
import java.util.Locale;
import java.util.UUID;

public class Client {
    ///Atributos
    private UUID idClient;
    private String name;
    private String email;
    private double discount;
    ///Constructor
    public Client (){
    }

    public Client (String name,String email,double discount){
        this.idClient = UUID.randomUUID();
        this.name = name;
        this.email = email;
        this.discount = discount;
    }
    ///Getters and Setters
    public UUID getIdClient() {
        return idClient;
    }

    public void setIdClient(UUID idClient) {
        this.idClient = idClient;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    ///Metodos
   public String toPrintClient (){
        return "Cliente \n ID: " + idClient.toString().substring(0,8).toUpperCase() +
                " | Nombre: " + this.name + "| Email: " + this.email + "| Descuento: " + this.discount + "%";
   }
}
