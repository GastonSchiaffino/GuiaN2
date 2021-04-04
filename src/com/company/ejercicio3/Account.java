package com.company.ejercicio3;

import java.util.UUID;

public class Account {

    public static final int MaxOperations=10;

    private UUID idAccount;
    private ClientBank client;
    private double balance;
    private int accountantOperations = 0;
    private String[] operations = new String[MaxOperations];

    public Account(){
    }

    public Account (ClientBank client, double balance){
        this.idAccount = UUID.randomUUID();
        this.balance = balance;
        this.client = client;
    }

    /// Getter and Setter


    public int getAccountantOperations() {
        return accountantOperations;
    }

    public void setAccountantOperations(int accountantOperations) {
        this.accountantOperations = accountantOperations;
    }

    public String[] getOperations() {
        return operations;
    }

    public void setOperations(String[] operations) {
        this.operations = operations;
    }

    public UUID getIdAccount() {
        return idAccount;
    }

    public void setIdAccount(UUID idAccount) {
        this.idAccount = idAccount;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public ClientBank getClient() {
        return client;
    }

    public void setClient(ClientBank client) {
        this.client = client;
    }

    ///Metodo
    public double deposit (double insert){
        documentDeposit(insert);
        return this.balance += insert;
    }
    public double extract (double retirement ){
        if(this.balance>=retirement-2000){
            this.balance-=retirement;
            documentRetirement(retirement);
        }else{
            System.out.println("No hay saldo suficiente para la extracción de " + retirement);
        }
        return this.balance;
    }

    public String toPrintAccount(){
        return "Cuenta: \n [ID: " + this.idAccount.toString().toUpperCase().substring(0,10) +
                "\n" + this.client.toPrintClientBank() + "\nBalance: " + this.balance;
    }
public void documentDeposit (double insert){
        if(this.accountantOperations==MaxOperations){
            this.accountantOperations = 0;
        }
        operations[accountantOperations]= "El cliente " + client.getName() + " |Monto depositado: " + insert;
        this.accountantOperations++;
}
public void documentRetirement(double retirement){
        if(this.accountantOperations==MaxOperations){
            this.accountantOperations = 0;
        }
        operations[accountantOperations]= "El cliente " + client.getName() + " |Monto retirado: " + retirement;
        this.accountantOperations++;
}
}
