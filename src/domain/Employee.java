package domain;

import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Employee extends Person {
    private String ein;
    private String department;
    private String position;
    private String salary;
    private String status;
    private String rfc;

    // Constructor
    public Employee() {
    }

    public Employee(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String curp, String rfc) {
        super(name, address, phone, email, curp);
        this.ein = genEin();
        this.department = department;
        this.position = position;
        this.salary = salary;
        this.status = status;
        this.rfc = rfc;
    }

    // Show the employee's information
    public void show() {
        super.show();
        System.out.println("EIN: " + ein);
        System.out.println("Department: " + department);
        System.out.println("Position: " + position);
        System.out.println("Salary: " + salary);
        System.out.println("Status: " + status);
        System.out.println("RFC: " + rfc);
    }

    // Capture the employee's information
    public void capture() {
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the department: ");
        department = sc.nextLine();
        System.out.println("Enter the position: ");
        position = sc.nextLine();
        System.out.println("Enter the salary: ");
        salary = sc.nextLine();
        System.out.println("Enter the status: ");
        status = sc.nextLine();
        System.out.println("Enter the RFC: ");
        rfc = sc.nextLine();
        sc.close();
    }
    
    // Generates the username and password
    @Override
    protected String genUsername() {
        return this.fullName.toLowerCase().substring(0,2) + this.ein;
    }

    @Override
    protected String genPassword() {
        return this.ein + this.department.substring(0,3);
    }

    // Generates the employee's ein
    public String genEin() {
        SimpleDateFormat df = new SimpleDateFormat("MMMM");
        return df.format(this.getBirthDate()) + this.email.substring(0, 3) + String.valueOf(Math.random()).substring(2, 5);
    }

    // Getters and setters
    public String getEin() {
        return ein;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }
   
}
