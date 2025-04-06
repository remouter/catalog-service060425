package se.magnus.catalogservice.domain;

public class BookNotFoundException extends RuntimeException {
    public BookNotFoundException(String isbn) {
        super("A book with ISNBN " + isbn + " was not found.");
    }
}
