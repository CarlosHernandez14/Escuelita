package domain;

import javax.security.auth.Subject;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Professor extends Employee {
    Scanner sc = new Scanner(System.in);
    private final String id;
    private String userName;
    private String password;
    private String degree;
    private ArrayList<String> subjects;

    // Constructor
    public Professor() {
        this.id = genId();
    }
    // subjects array list son las materias que imparte
    // quite array list de subjects en constructor pero si se utiliza.
    public Professor(String name, String address, String phone, String email, String ein,
                     String department, String position, String salary, String status,
                     String curp, String rfc, String degree) {
        super(name, address, phone, email, ein, department, position, salary, status, curp, rfc);
        this.subjects = new ArrayList<>();
        this.id = genId();
        this.userName = genUsername();
        this.password = genPassword();
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

        System.out.print("Enter the degree: ");
        degree = sc.nextLine();
        System.out.println("SUBJECTS THAT TEACH - Type 'end' to finish");
        do {
            System.out.print("Enter the subject: ");
            String subject = sc.nextLine();
            if (subject.equalsIgnoreCase("end"))
                end = true;
            else if (this.subjects.contains(subject))
                System.out.println("The subject already exists");
            else
                this.subjects.add(subject);
        } while (end == false);
        userName = genUsername();
        password = genPassword();

    }

    // Generate a username for the Professor
    @Override
    public String genUsername() {
        String fullName = this.fullName.toLowerCase();
        String[] splitN = fullName.split(" ");
        String username = "teacher-" + splitN[0].substring(0, 3);
        return username;
    }

    // Generate a password for the Professor
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

    public void addSubject(String subject){
        this.subjects.add(subject);

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

    @Override
    public String toString() {
        return "Professor{" + "degree=" + degree + ", subjects=" + subjects + '}';
    }
}