package library.inventory;

import java.util.ArrayList;
import java.util.Scanner;

import library.material.*;

public class Inventory {
    private ArrayList<Product> products;
    private ArrayList<Product> loanedProducts;

    public Inventory() {
        products = new ArrayList<Product>();
        loanedProducts = new ArrayList<Product>();
    }


    // Remove a product from the inventory by its name
    public void removeProducts(String name) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                products.remove(i);
                break;
            }
        }
    }

    public void addProduct(Product product) {
        products.add(product);
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
    
    // SHOW METHODS
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

    // Show products
    public void showProducts() {
        Scanner sc = new Scanner(System.in);
        System.out.println("What kind of product do you want to see? (1. Book, 2. Magazine, 3. Tesis or 4. All)");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                for (Product product : products) {
                    if (product instanceof Book) {
                        product.show();
                    }
                }
                break;
            case 2:
                for (Product product : products) {
                    if (product instanceof Magazine) {
                        product.show();
                    }
                }
                break;
            case 3:
                for (Product product : products) {
                    if (product instanceof Tesis) {
                        product.show();
                    }
                }
                break;
            case 4:
                products.forEach(product -> product.show());
                break;
            default:
                System.out.println("Invalid option");
                break;
        }
        sc.close();
    }
    
    // Show books with index
    public void showBooks() {
        int index = 1;
        for (Product product : products) {
            if (product instanceof Book) {
                System.out.println(index + ". " + product.getName());
                index++;
            }
        }
    }

    // Show magazines with index
    public void showMagazines() {
        int index = 1;
        for (Product product : products) {
            if (product instanceof Magazine) {
                System.out.println(index + ". " + product.getName());
                index++;
            }
        }
    }

    // Show tesis with index
    public void showTesis() {
        int index = 1;
        for (Product product : products) {
            if (product instanceof Tesis) {
                System.out.println(index + ". " + product.getName());
                index++;
            }
        }
    }

    // Show loaned books
    public void showLoanedBooks() {
        for (Product product : loanedProducts) {
            if (product instanceof Book) {
                product.show();
            }
        }
    }

    // Show loaned magazines
    public void showLoanedMagazines() {
        for (Product product : loanedProducts) {
            if (product instanceof Magazine) {
                product.show();
            }
        }
    }

    // Show loaned tesis
    public void showLoanedTesis() {
        for (Product product : loanedProducts) {
            if (product instanceof Tesis) {
                product.show();
            }
        }
    }

    public Product searchProduct(String text) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(text) || product.getAuthor().equalsIgnoreCase(text) || product.getLanguage().equalsIgnoreCase(text)) {
                return product;
            }
        }
        return null;
    }

    // Get the total of products in the inventory, by type
    public void getTotalProducts() {
        int totalBooks = 0;
        int totalMagazines = 0;
        int totalTesis = 0;
        for (Product product : products) {
            if (product instanceof Book) {
                totalBooks++;
            } else if (product instanceof Magazine) {
                totalMagazines++;
            } else if (product instanceof Tesis) {
                totalTesis++;
            }
        }
        System.out.println("Total books: " + totalBooks);
        System.out.println("Total magazines: " + totalMagazines);
        System.out.println("Total tesis: " + totalTesis);
    }

    // Get the status of a product by name
    public boolean getStatus(String name) {
        for (Product product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return true;
            }
        }
        return false;
    }
    
    // Loan a product by name
    public void loanProduct(String name) throws Exception {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equalsIgnoreCase(name)) {
                loanedProducts.add(products.get(i));
                products.remove(i);
                break;
            }
        }
    }

    // Return a product by name
    public void returnProduct(String name) throws Exception {
        for (int i = 0; i < loanedProducts.size(); i++) {
            if (loanedProducts.get(i).getName().equalsIgnoreCase(name)) {
                products.add(loanedProducts.get(i));
                loanedProducts.remove(i);
                break;
            }
        }
    }
}
