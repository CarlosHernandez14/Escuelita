package domain;

import java.util.ArrayList;

public class Professor extends Employee {
    private String degree;
    private ArrayList<String> subjects;

    // Constructor
    public Professor(String name, String address, String phone, String email, String ein, String department, String position, String salary, String status, String birthDate, String curp, String rfc, String degree, ArrayList<String> subjects) {
        super(name, address, phone, email, ein, department, position, salary, status, birthDate, curp, rfc);
        this.degree = degree;
        this.subjects = subjects;
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
