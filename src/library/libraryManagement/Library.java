package library.libraryManagement;
import domain.*;
import library.inventory.Inventory;
import library.material.*;

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

    // Register a new Product
    public void registerProduct() {
        inventory.register();
    }

    // Search a book by its attributes
    public Book searchBook(String text) {
        Product prod = inventory.searchProduct(text);
        if (prod instanceof Book) {
            return (Book) prod;
        }
        System.out.println("Book not found");
        return null;
    }
    
    // Loan a book ---> This method might be put in a cycle from the main method
    public boolean loanProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.print("What kind of product do you want to loan? (1. Books 2. Magazine 3. Tesis): ");
        int option = Integer.parseInt(sc.nextLine());
        String name = "";
        switch (option) {
            case 1:
                inventory.showBooks();
                System.out.println("Enter the name of the book: ");
                name = sc.nextLine();
                break;
            case 2:
                inventory.showMagazines();
                System.out.println("Enter the name of the magazine: ");
                name = sc.nextLine();
                break;
            case 3:
                inventory.showTesis();
                System.out.println("Enter the name of the tesis: ");
                name = sc.nextLine();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        sc.close();
        try {
            inventory.loanProduct(name);
        } catch (Exception e) {
            System.err.println("ERROR -> the product could not be loaned");
            return false;
        }
        return true;
    }

    // Return a book
    public boolean returnProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Whih product do you want to return? (1. Books 2. Magazine 3. Tesis): ");
        int option = Integer.parseInt(sc.nextLine());
        String name = "";
        switch (option) {
            case 1:
                inventory.showLoanedBooks();
                System.out.println("Enter the name of the book: ");
                name = sc.nextLine();
                break;
            case 2:
                inventory.showLoanedMagazines();
                System.out.println("Enter the name of the magazine: ");
                name = sc.nextLine();
                break;
            case 3:
                inventory.showLoanedTesis();
                System.out.println("Enter the name of the tesis: ");
                name = sc.nextLine();
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        sc.close();
        try {
            inventory.returnProduct(name);
        } catch (Exception e) {
            System.err.println("ERROR -> the product could not be returned");
            return false;
        }
        return true;
    }

    // Verify if the student exists
    private boolean verifyStudent(String name) {
        
        return false;
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