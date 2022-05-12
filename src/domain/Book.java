package domain;

import java.util.Scanner;

public class Book {
    private int id;
    private String name;
    private String author;
    private String genre;
    private static int cBook = 0;
    
    public Book() {

    }

    public Book(int id, String name, String author, String genre) {
        this.id = Book.cBook++;
        this.name = name;
        this.author = author;
        this.genre = genre;

    }

    public void show() {
        System.out.print("Book id: " + id);
        System.out.print("Book name: " + name);
        System.out.print("Book author: ");
        System.out.print("Book genre: " + genre);
    }

    // Capture the book's information
    public void capture() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Book's id: " + id);
        System.out.print("Enter the book's name: ");
        name = sc.nextLine();
        System.out.print("Enter the book's author: ");
        author = sc.nextLine();        
        System.out.print("Enter the book's genre: ");
        genre = sc.nextLine();
        sc.close();
    }

    // getters & setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

}
