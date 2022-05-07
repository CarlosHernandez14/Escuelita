package domain;

import java.util.ArrayList;
import java.util.Scanner;

public class Professor extends Employee {
    private String degree;
    private ArrayList<String> subjects;

    // Constructor
    public Professor() {

    }

    public Professor(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String curp, String rfc, String degree, ArrayList<String> subjects) {
        super(name, address, phone, email, ein, department, position, salary, status, curp, rfc);
        this.degree = degree;
        this.subjects = subjects;
    }

    // Show and capture methods
    @Override
    public void show() {
        super.show();
        System.out.println("Degree: " + degree);
        System.out.println("Subjects: " + subjects);
    }

    @Override
    public void capture() {
        super.capture();
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the degree: ");
        degree = sc.nextLine();
        System.out.println("SUBJECTS THAT TEACH - Type 'end' to finish");
        do {
            System.out.println("Enter the subject: ");
            String subject = sc.nextLine();
            if (subject.equalsIgnoreCase("end"))
                end = true;
            else if (this.subjects.contains(subject))
                System.out.println("The subject already exists");
            else
                this.subjects.add(subject);
        } while (end == false);
        
        sc.close();
    }

    // Getters and setters
    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "Professor{" + "degree=" + degree + ", subjects=" + subjects + '}';
    }
}