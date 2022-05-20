package domain;

import java.util.Scanner;

public class Janitor extends Employee {
    private String cleanArea;

    public Janitor() {

    }

    public Janitor(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String curp, String rfc, String cleanArea) {
        super(name, address, phone, email, ein, department, position, salary, status, curp, rfc);
        this.cleanArea = cleanArea;
    }

    public String getCleanArea() {
        return cleanArea;
    }

    public void setCleanArea(String cleanArea) {
        this.cleanArea = cleanArea;
    }

    // Show the information of the Janitor
    @Override
    public void show() {
        super.show();
        System.out.println("Clean Area: " + cleanArea);
    }

    // Capture the information of the Janitor
    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the clean area: ");
        cleanArea = sc.nextLine();
        sc.close();
    }

}
