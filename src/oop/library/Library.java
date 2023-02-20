package oop.library;

import java.util.ArrayList;
import java.util.Objects;

public class Library {

    private ArrayList<Book> books = new ArrayList<>();


    public Boolean addBook(Book book) {
        return this.books.add(book);
    }

    public Boolean removeBook(Book book) {
        return this.books.remove(book);
    }

    public Book findBookByTitle(String title) throws BookNotFoundException {
        for ( Book book:books ) {
            if (Objects.equals(book.getTitle(), title)) {
                return book;
            }
        }
        throw new BookNotFoundException(title);
    }

    public Book findBookByAuthor(String author) throws BookNotFoundException {
        for ( Book book:books ) {
            if (book.getAuthors().contains(author)) {
                return book;
            }
        }
        throw new BookNotFoundException(author);
    }

    public Book findBookByPublicationYear(int publicationYear) throws BookNotFoundException {
        for ( Book book:books ) {
            if (book.getPublicationYear() == publicationYear) {
                return book;
            }
        }
        throw new BookNotFoundException(publicationYear);
    }

    public Book findBookByPublisher(String publisher) throws BookNotFoundException {
        for ( Book book:books ) {
            if (Objects.equals(book.getPublisher(), publisher)) {
                return book;
            }
        }
        throw new BookNotFoundException(publisher);
    }
}
