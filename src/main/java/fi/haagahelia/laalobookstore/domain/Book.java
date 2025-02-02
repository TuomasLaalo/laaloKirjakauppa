package fi.haagahelia.laalobookstore.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity  //  Tämä määrittää Book-luokan tietokantaentiteetiksi
public class Book {

    @Id  //  Ensisijainen avain (primary key)
    @GeneratedValue(strategy = GenerationType.AUTO)  // ID generoidaan automaattisesti
    private Long id;

    private String title;
    private String author;
    private int publicationYear;
    private String isbn;
    private double price;

    // Oletuskonstruktori (pakollinen JPA:lle)
    public Book() {}

    // Konstruktori esimerkkidataa varten
    public Book(String title, String author, int publicationYear, String isbn, double price) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isbn = isbn;
        this.price = price;
    }

    //  Getterit ja setterit
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
}
