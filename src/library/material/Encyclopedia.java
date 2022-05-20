package library.material;

import java.util.Date;
import java.util.Scanner;

public class Encyclopedia extends Product {
    private String editorial;
    private String subject;
    public Date datePublished;

    public Encyclopedia() {
    }

    public Encyclopedia(String name, String author, String description, String editorial, String subject, String language, Date datePublished) {
        super(name, author, description, language);
        this.editorial = editorial;
        this.subject = subject;
        this.datePublished = datePublished;
    }

    // Show and capture methods
    @Override
    public void show() {
        super.show();
        System.out.println("Editorial: " + editorial);
        System.out.println("Subject: " + subject);
        System.out.println("Date published: " + datePublished);
    }

    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the editorial: ");
        editorial = sc.nextLine();
        System.out.print("Enter the subject: ");
        subject = sc.nextLine();
        System.out.print("Enter the date published: ");
        datePublished = new Date();
        sc.close();
    }

    // Getters and setters
    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
    
}
