package com.company.ejercicio3;

import java.util.UUID;

public class ClientBank {

    private UUID idCliente;
    private String name;
    private char gender;

    public ClientBank(){
    }
    public ClientBank (String name, char gender){
        this.idCliente = UUID.randomUUID();
        this.name = name;
        this.gender = gender;
    }

    public UUID getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(UUID idCliente) {
        this.idCliente = idCliente;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String toPrintClientBank(){
        return  "Cliente: [ID: " + this.idCliente.toString().substring(0,4).toUpperCase() +
                " |Nombre: " + this.name + " |Genero: " + this.gender + "]";
    }
}
