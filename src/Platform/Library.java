package Platform;
import domain.*;
import java.util.*;

public class Library {
    private String apartment;
    private Employee librarian[] = new Employee[5];
    private Map<Book, Integer> books;

    // Constructor
    public Library () {
    }
    
    public Library(String apartment) {
        this.apartment = apartment;
    }

    // Register a new book
    public void registerBook() {
        Book book = new Book();
        book.capture();
        String bName = book.getName();
        // PROBAR METODO EN METHOD TEST
        books.forEach((k, v) -> {
            if (k.getName().equalsIgnoreCase(bName)) {
                System.out.println("The book is already registered");
                int value = books.get(k);
                books.replace(k, value + 1);
            } else {
                books.put(book, 1);
            }
        });
    }

    // Search a book by its attributes
    public Book searchBook(String text) {
        String datos = "";
        for (Book b: books.keySet()) {
            datos = b.getName() + b.getAuthor() + b.getGenre();
            if (datos.contains(text)) {
                return b;
            }
        }
        System.out.println("Book not found");
        return null;
    }


    // Getters and setters
    public String getApartment() {
        return apartment;
    }

    public void setApartement(String apartment) {
        this.apartment = apartment;
    }

    public Employee[] getLibrarian() {
        return librarian;
    }

    public void setLibrarian(Employee[] librarian) {
        this.librarian = librarian;
    }

    public Map<Book, Integer> getBooks() {
        return books;
    }

    public void setBooks(Map<Book, Integer> books) {
        this.books = books;
    }

}