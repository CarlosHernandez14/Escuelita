package library.material;

import java.util.Scanner;

public class Tesis extends Product {
    private String author;
    private String language;

    public Tesis() {
    }

    public Tesis(String name, String author, String description, String language) {
        super(name, author, description, language);
        this.author = author;
        this.language = language;
    }

    // Show and capture methods
    @Override
    public void show() {
        super.show();
        System.out.println("Autor: " + author);
        System.out.println("Idioma: " + language);
    }

    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the autor: ");
        author = sc.nextLine();
        System.out.print("Enter the language: ");
        language = sc.nextLine();
        sc.close();
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String autor) {
        this.author = autor;
    }

}
