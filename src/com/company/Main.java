package com.company;

import com.company.ejercicio2.Client;
import com.company.ejercicio2.Invoice;
import com.company.ejercicio2.SaleItem;
import ejercicio1.Author;
import ejercicio1.Book;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


public class Main {

    public static void main(String[] args) {

        List<Author> authors = new ArrayList<Author>();
        ///Inciso A y B
        Author author = new Author("Joshua","Bloch","joshua@email.com",'M');
        Author author1 = new Author("Edu","Puig","ricki@email.com",'M');
        Author author2 = new Author("Ramira","Robusta","rami@email.com",'F');
        Author author3 = new Author("Ricochet","Frijolito","frijo@email.com",'M');

        authors.add(author);
        authors.add(author1);
        authors.add(author2);
        authors.add(author3);

        System.out.println("\n" + author.getName() + "\n" + author.getSurname()+ "\n"  + author.getEmail() + "\n" + author.getGender());

        ///Inciso C y D
        Book book = new Book("Effective Java", 450,150, authors);
        System.out.println(book.toprintBook());

        ///Inciso E (Dos formas)
        book.increasePrice(50);
        book.increaseStock(50);
        System.out.println(book.toprintBook());

        book.setPrice(600);
        book.setStock(100);
        System.out.println(book.toprintBook());

        ///Inciso F
        System.out.println( "\n" +book.getAuthor().get(0).getName()+ "\n" +book.getAuthor().get(0).getSurname()+ "\n" +book.getAuthor().get(0).getEmail()+ "\n" +book.getAuthor().get(0).getGender());

        ///Inciso G
        System.out.println(book.toprintBookWithPrice(authors));

        ///Inciso H (Modificado el g)

        Client client = new Client("Gaston ","gaston@gmail.com ",20);

        System.out.println(client.toPrintClient());
        SaleItem item1=new SaleItem("Alfajor", "Jorgito",10,50);
        SaleItem item2=new SaleItem("Tableta de Chocalate-Frutilla", "Cadbury", 200, 5);
        SaleItem item3=new SaleItem("Chupetin", "Pop",5, 500);

        SaleItem[] items = new SaleItem[3];
        items[0]=item1;
        items[1]=item2;
        items[2]=item3;

        Invoice invoice = new Invoice(items,client);
        System.out.println(invoice.toPrintInvoice());








    }

}
