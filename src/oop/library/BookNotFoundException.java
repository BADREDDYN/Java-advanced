package oop.library;


public class BookNotFoundException extends Exception {
    public <T> BookNotFoundException(T searchBy) {
        super("The book searched for by " + searchBy + " could not be found.");
    }
}