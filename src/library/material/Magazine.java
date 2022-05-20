package library.material;

import java.util.Date;
import java.util.Scanner;

public class Magazine extends Product {
    private String periodicity;
    private Date datePublished;

    public Magazine() {
    }

    public Magazine(String name, String author, String description, String language, String periodicity, Date datePublished) {
        super(name, author, description, language);
        this.periodicity = periodicity;
        this.datePublished = datePublished;
    }

    // Show and capture methods
    @Override
    public void show() {
        super.show();
        System.out.println("Periodicity: " + periodicity);
        System.out.println("Date published: " + datePublished);
    }

    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the periodicity: ");
        periodicity = sc.nextLine();
        System.out.print("Enter the date published: ");
        datePublished = new Date();
        sc.close();
    }

    // Getters and setters

    public String getPeriodicity() {
        return periodicity;
    }

    public void setPeriodicity(String periodicity) {
        this.periodicity = periodicity;
    }

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }
    
}
