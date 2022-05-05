package domain;

import java.util.*;
import java.text.SimpleDateFormat; 

public class Student  extends Person {
    private final String numControl;
    private String career;
    private int semester;
    private double grade;
    private boolean status;
   
    // Constructor's
    public Student() {
        super();
        // Generate a random number for the student's numControl of 8 digits
        this.numControl = genNumControl();
    }
    public Student(String name, String address, String phone, String email, String career, int semester, double grade, boolean status, String birthDate, String curp) {
        super(name, address, phone, email, birthDate, curp);
        this.numControl = genNumControl();
        this.career = career;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    // Swhow the student's information
    @Override
    public void show(){
        super.show();
        System.out.println("Numero de control: " + numControl);
        System.out.println("Carrera: " + career);
        System.out.println("Semestre: " + semester);
        System.out.println("Calificacion: " + grade);
        System.out.println("Status: " + status);
    }

    // Capture the student's information
    @Override
    public void capture(){
        super.capture();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the career: ");
        career = sc.nextLine();
        System.out.println("Enter the semester: ");
        semester = sc.nextInt();
        System.out.println("Enter the grade: ");
        grade = sc.nextDouble();
        System.out.println("Enter the status: ");
        status = sc.nextBoolean();
    }

    // Generate a random number for the student's numControl of 8 digits
    private String genNumControl() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return (df.format(date)) + String.valueOf(Math.random()).substring(2, 5);
    }

    // Getters and setters
    public String getNumControl() {
        return numControl;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

}
