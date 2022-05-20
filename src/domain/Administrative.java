package domain;

import java.util.Scanner;

public class Administrative extends Employee {
    private String plaza;

    // Constructor
    public Administrative() {

    }

    public Administrative(String name, String address, String phone, String email, String ein, String department,
            String position, String salary, String status, String curp, String rfc, String plaza) {
        this.plaza = plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    // Show the information of the Administrative
    @Override
    public void show() {
        super.show();
        System.out.println("Plaza: " + plaza);
    }

    // Capture the information of the Administrative
    @Override
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the plaza: ");
        plaza = sc.nextLine();
        sc.close();
    }

    public String getPlaza() {
        return plaza;
    }

}
