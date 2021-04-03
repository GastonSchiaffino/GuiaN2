package com.company.ejercicio1;

import java.util.List;

public class Book {
    private String title;
    private double price;
    private int stock;
    private List<Author> author;

    public  Book (){
    }
    public Book (String title,double price,int stock,List<Author> author){
        this.title = title;
        this.price = price;
        this.stock = stock;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public List<Author> getAuthor() {
        return author;
    }

    public void setAuthor(List<Author> author) {
        this.author = author;
    }

    public double increasePrice(double increase) {
        return this.price = this.price + increase;
    }
    public int increaseStock(int increase){
        return this.stock = this.stock + increase;
    }

    public String toprintBook (){
        return ("\n" + this.title + "\n" + this.price+ "\n"  + this.stock + "\n" + this.author.get(0).getName() + " " + this.author.get(0).getSurname());
    }

    public String toprintBookWithPrice (List<Author> authors){
        String local = "";

        if(authors.size()>0) {
            for (Author author:authors) {
                local = local + "\n" + author.name + " " + author.surname + ".";
            }
        }else{
            local="autor desconocido";
        }
        return  "\nEl libro " + this.title + " de: " + local + "\nSe vende a " + this.price + " pesos.";
    }
}