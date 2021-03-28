package ejercicio1;

public class Author extends Book {

    String name;
    String surname;
    String email;
    char gender;

    public Author(String name, String surname, String email, char gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public Author(String title, double price, int stock, String author, String name, String surname, String email, char gender) {
        super(title, price, stock, author);
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}

