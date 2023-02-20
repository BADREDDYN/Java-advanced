package oop.library;

import java.util.ArrayList;

public class Book {

    private String title;
    private final ArrayList<String> authors = new ArrayList<>();
    private int publicationYear;
    private int pagesNumber;
    private String publisher;


    public Book(
            String title, String author, int publicationYear,
            int pagesNumber, String publisher
    ) {
        this.title = title;
        this.publicationYear = publicationYear;
        this.pagesNumber = pagesNumber;
        this.publisher = publisher;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public ArrayList<String> getAuthors() {
        return authors;
    }

    public void addAuthor(String author) {
        this.authors.add(author);
    }

    public Boolean removeAuthor(String author) {
        return this.authors.remove(author);
    }


    public int getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }


    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }


    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

}
