package library.inventory;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import library.material.Product;

public class Ticket {
    private int idTicket;
    private Date date;
    private ArrayList<Product> products;
    private String loanTime;
    private static int contTickets = 0;

    public Ticket() {
    }

    public Ticket(Date date, ArrayList<Product> products, String loanTime) {
        this.idTicket = contTickets++;
        this.date = date;
        this.products = products;
        this.loanTime = loanTime;
    }

    // Show and capture methods
    public void show() {
        System.out.println("Id ticket: " + idTicket);
        System.out.println("Date: " + date);
        products.forEach(product -> product.show());
        System.out.println("Loan time: " + loanTime);
    }

    public void capture(ArrayList<Product> p) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the id ticket: ");
        idTicket = sc.nextInt();
        System.out.print("Enter the date: ");
        date = new Date();
        System.out.print("Enter the products: ");
        products = p;
        System.out.print("Enter the loan time: ");
        loanTime = sc.nextLine();
        sc.close();
    }
    

    public int getIdTicket() {
        return idTicket;
    }

    public void setIdTicket(int idTicket) {
        this.idTicket = idTicket;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public String getLoanTime() {
        return loanTime;
    }

    public void setLoanTime(String loanTime) {
        this.loanTime = loanTime;
    }
}
