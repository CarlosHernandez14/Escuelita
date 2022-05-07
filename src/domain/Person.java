package domain;

import java.util.Scanner;

public abstract class Person {
    protected String fullName;
    protected String address;
    protected String phone;
    protected String email;
    protected String birthDate;
    protected String curp;
    // Constructor's
    public Person(){

    }

    public Person(String fullName, String address, String phone, String email, String birthDate, String curp) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = birthDate;
        this.curp = curp;
    }
    
    // Abstract methods
    protected abstract String genUsername();

    // Show the people information
    protected void show() {
        System.out.println("fullName: " + fullName);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Birth date: " + birthDate);
        System.out.println("CURP: " + curp);
    }

    // Capture the people information
    protected void capture() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the fullName: ");
        fullName = sc.nextLine();
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
    public String getfullName() {
        return fullName;
    }

    public void setfullName(String fullName) {
        this.fullName = fullName;
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
