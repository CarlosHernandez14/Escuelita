package domain;

import java.util.Date;
import java.util.Scanner;

public abstract class Person {
    protected String fullName;
    protected String address;
    protected String phone;
    protected String email;
    protected Date birthDate;
    protected String curp;
    // Constructor's
    public Person(){

    }

    public Person(String fullName, String address, String phone, String email, String curp) {
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.birthDate = captureBirthDate();
        this.curp = curp;
    }

    // Abstract methods
    protected abstract String genUsername();
    protected abstract String genPassword();

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
        System.out.print("Enter the fullName: ");
        fullName = sc.nextLine();
        System.out.print("Enter the address: ");
        address = sc.nextLine();
        System.out.print("Enter the phone: ");
        phone = sc.nextLine();
        System.out.print("Enter the email: ");
        email = sc.nextLine();
        birthDate = captureBirthDate();
        System.out.print("Enter the CURP: ");
        curp = sc.nextLine();
        sc.close();
    }

    public Date captureBirthDate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the birth date");
        System.out.print("Enter the day: ");
        int day = sc.nextInt();
        System.out.print("Enter the month: ");
        int month = sc.nextInt();
        System.out.print("Enter the year: ");
        int year = sc.nextInt();
        sc.close();
        return new Date(1900,1, 5);
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

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getCurp() {
        return curp;
    }

    public void setCurp(String curp) {
        this.curp = curp;
    }

}
