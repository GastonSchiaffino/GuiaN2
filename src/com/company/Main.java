package com.company;

import ejercicio1.Author;
import ejercicio1.Book;

public class Main {

    public static void main(String[] args) {
        ///Inciso A y B
        Author author = new Author("Joshua","Bloch","joshua@email.com",'M');
        System.out.println("\n" + author.getName() + "\n" + author.getSurname()+ "\n"  + author.getEmail() + "\n" + author.getGender());
///Inciso C y D
        Book book = new Book("Effective Java", 450,150,author.getName() + " " + author.getSurname());
        System.out.println("\n" + book.getTitle() + "\n" + book.getPrice()+ "\n"  + book.getStock() + "\n" + book.getAuthor());
///Inciso E (Dos formas)
        book.increasePrice(50);
        book.increaseStock(50);
        System.out.println("\n" + book.getTitle() + "\n" + book.getPrice()+ "\n"  + book.getStock() + "\n" + book.getAuthor());

        book.setPrice(600);
        book.setStock(100);
        System.out.println("\n" + book.getTitle() + "\n" + book.getPrice()+ "\n"  + book.getStock() + "\n" + book.getAuthor());
///Inciso F
        System.out.println("\n" + book.() + "\n" + book.getPrice()+ "\n"  + book.getStock() + "\n" + book.getAuthor());

    }

}
