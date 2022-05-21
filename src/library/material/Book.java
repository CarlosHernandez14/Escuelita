package library.material;

import java.util.Scanner;

public class Book extends Product {
    private String isbn; // International Standard Book Number
    private String publisher;
    private String genre;

    public Book() {
    }

    public Book(String name, String author, String description,String publisher, String language, String genre) {
        super(name, author, description, language);
        generateIsbn();
        this.publisher = publisher;
        this.genre = genre;
    }

    // Show and capture methods
    @Override
    public void show() {
        super.show();
        System.out.println("ISBN: " + isbn);
        System.out.println("Publisher: " + publisher);
        System.out.println("Genre: " + genre);
    }

    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the ISBN: ");
        isbn = sc.nextLine();
        System.out.print("Enter the publisher: ");
        publisher = sc.nextLine();
        System.out.print("Enter the genre: ");
        genre = sc.nextLine();
        sc.close();
    }

    // Generate isbn
    private void generateIsbn() {
        String isbn = "";
        for (int i = 0; i < 10; i++) {
            isbn += (int) (Math.random() * 10);
        }
        this.isbn = isbn;
    }

    // Getters and setters
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
