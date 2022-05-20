package library.libraryManagement;
import domain.*;
import library.inventory.Inventory;

import java.util.*;

public class Library {
    private String apartment;
    private Employee librarian[] = new Employee[5];
    private Inventory inventory;

    // Constructor
    public Library () {
    }
    
    public Library(String apartment) {
        this.apartment = apartment;
        inventory = new Inventory();
    }

    // Register a new book
    public void registerBook() {
        inventory.register();
    }

    // Search a book by its attributes
    public Book searchBook(String text) {
        
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
}