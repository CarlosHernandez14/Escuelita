package library.material;

import java.util.Scanner;

public class Product {
    private String name;
    private String author;
    private String description;
    private String language;

    public Product() {
    }

    public Product(String name, String author, String description , String language) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.language = language;
    }
    
    // Show the product information
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Author: " + author);
        System.out.println("Language: " + language);
        System.out.println("Description: " + description);
    }

    // Capture the product information
    public void capture() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the name: ");
        name = sc.nextLine();
        System.out.print("Enter the author: ");
        author = sc.nextLine();
        System.out.println("Enter the language: ");
        language = sc.nextLine();
        System.out.print("Enter the description: ");
        description = sc.nextLine();
        sc.close();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
