package domain;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Administrative extends Employee {
    Scanner sc = new Scanner(System.in);
    private final String id;
    private String plaza;
    private String userName;
    private String password;

    // Constructor
    public Administrative() {
        super();
        this.id = genId();
    }

    public Administrative(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String curp, String rfc, String plaza) {
        super(name, address, phone, email, ein, department, position, salary, status, curp, rfc);
        this.id = genId();
        this.userName = genUsername();
        this.password = genPassword();
        this.plaza = plaza;
    }

    //    public Administrative(String fullName, String address, String phone, String email, String ein, String department,
//            String position, String salary, String status, String curp, String rfc, String plaza) {
//        super();
//        this.id = genId();
//        this.userName = genUsername();
//        this.password = genPassword();
//        this.plaza = plaza;
//    }

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
        password = genPassword();
        userName = genUsername();
        System.out.print("Enter the plaza: ");
        plaza = sc.nextLine();
    }

    // Generate a username for the Admin
    @Override
    public String genUsername() {
        String fullName = this.fullName.toLowerCase();
        String[] splitN = fullName.split(" ");
        String username = "admin" + splitN[0].substring(0, 3);
        return username;
    }

    // Generate a password for the Admin
    @Override
    public String genPassword() {
        String password = this.id + this.fullName.substring(0, 3);
        return password;
    }

    // Generate a random number for the student's numControl of 8 digits
    private String genId() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return (df.format(date)) + String.valueOf(Math.random()).substring(2, 5);
    }

    public String getPlaza() {
        return plaza;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getId() {
        return id;
    }
}
