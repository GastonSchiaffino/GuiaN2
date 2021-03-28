package ejercicio1;

public class Book {
    String title;
    double price;
    int stock;
    String author;

    public Book (){
    }
    public Book (String title,double price,int stock,String author){
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

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double increasePrice(double increase) {
        return this.price = this.price + increase;
    }
    public int increaseStock(int increase){
        return this.stock = this.stock + increase;
    }
}

