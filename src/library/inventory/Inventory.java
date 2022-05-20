package library.inventory;

import java.util.ArrayList;
import java.util.Scanner;

import library.material.*;

public class Inventory {
    private ArrayList<Product> products;

    public Inventory() {
        products = new ArrayList<Product>();
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void showProducts() {
        for (Product product : products) {
            product.show();
        }
    }

    // Register a new product
    public void register() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose the type of product: ");
        System.out.println("1. Book");
        System.out.println("2. Magazine");
        System.out.println("3. Tesis");
        System.out.print("====>:");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                Book book = new Book();
                book.capture();
                addProduct(book);
                break;
            case 2:
                Magazine magazine = new Magazine();
                magazine.capture();
                addProduct(magazine);
                break;
            case 3:
                Tesis tesis = new Tesis();
                tesis.capture();
                addProduct(tesis);
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        sc.close();
    }

    public void showProductsByAuthor(String author) {
        for (Product product : products) {
            if (product.getAuthor().equals(author)) {
                product.show();
            }
        }
    }

    public void showProductsByLanguage(String language) {
        for (Product product : products) {
            if (product.getLanguage().equals(language)) {
                product.show();
            }
        }
    }

    public void searchProduct(String text) {
        boolean found = false;
        for (Product product : products) {
            if (product.getName().contains(text) || product.getAuthor().contains(text) || product.getLanguage().contains(text)) {
                product.show();
                found = true;
            }
        }
        if (!found) {
            System.out.println("No products found");
        }
    }
}
