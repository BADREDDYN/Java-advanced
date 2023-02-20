package oop.library;

public class Main {

    public static void main(String[] args) throws BookNotFoundException {

        Library fruitsLib = new Library();

        fruitsLib.addBook(
                new Book(
                        "Apple Book",
                        "Orange",
                        2012,
                        456,
                        "Strawberry"
                )
        );

        Book appleBook = fruitsLib.findBookByPublicationYear(2012);
        System.out.println(appleBook.getTitle());

        fruitsLib.removeBook(appleBook);

        appleBook = fruitsLib.findBookByPublicationYear(2012);
        System.out.println(appleBook.getTitle());

    }
}
