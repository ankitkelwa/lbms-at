
package LMS;

import java.util.*;

public class Book {

    private int isbn;
    private String title;
    private String author;
    private String publicationYear;

    public Book(int isbn, String title, String author, Sting publicationYear) {
        this.isbn = id;
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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

    public String getpublicationYear() {
        return publicationYear;
    }

    public void setpublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    abstract void addBook(Book);
    abstract void removeBook(isbn);
    abstract void updateBook(isbn,Book);
    abstract void searchBook(isbn);
} 