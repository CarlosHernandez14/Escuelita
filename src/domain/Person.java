package domain;

import java.util.Scanner;

public class Person {
    private String name;
    private String address;
    private String phone;
    private String email;
    private String birthDate;
    private String curp;

    // Constructor's
    public Person(){

    }

    public Person(String name, String address, String phone, String email, String birthDate, String curp) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.curp = curp;
    }

    // Show the people information
    public void show() {
        System.out.println("Name: " + name);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Birth date: " + birthDate);
        System.out.println("CURP: " + curp);
    }

    // Capture the people information
    public void capture() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the phone: ");
        phone = sc.nextLine();
        System.out.println("Enter the email: ");
        email = sc.nextLine();
        System.out.println("Enter the birth date: ");
        birthDate = sc.nextLine();
        System.out.println("Enter the CURP: ");
        curp = sc.nextLine();
    }

    // Getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
