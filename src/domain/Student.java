package domain;
import java.util.*;
import java.text.SimpleDateFormat;

public class Student  extends Person {
    Scanner sc = new Scanner(System.in);
    private final String numControl;
    private String userName;
    private String password;
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
    public Student(String name, String address, String phone, String email, String career, int semester, double grade, boolean status, String curp) {
        super(name, address, phone, email, curp);
        this.numControl = genNumControl();
        this.userName = genUsername();
        this.password = genPassword();
        this.career = career;
        this.semester = semester;
        this.grade = grade;
        this.status = status;
    }

    // Swhow the student's information
    @Override
    public void show(){
        super.show();
        System.out.println("Control Number: " + numControl);
        System.out.println("Carrera: " + career);
        System.out.println("Semestre: " + semester);
        System.out.println("Calificacion: " + grade);
        System.out.println("Status: " + status);
    }

    // Capture the student's information
    @Override
    public void capture(){
        super.capture();
        try {
            password = genPassword();
            userName = genUsername();
			System.out.print("Enter the career: ");
			career = sc.nextLine();
			System.out.print("Enter the semester: ");
			semester = Integer.parseInt(sc.nextLine());
			System.out.print("High school grade: ");
			grade = Double.parseDouble(sc.nextLine());
			System.out.print("Enter the status (True - Current Student, False - Student Dropped Out): ");
			status = sc.nextBoolean();
		} catch (Exception e){
            e.printStackTrace();
        }
    }

    // Generate a random number for the student's numControl of 8 digits
    private String genNumControl() {
        Date date = new Date();
        SimpleDateFormat df = new SimpleDateFormat("yyyy");
        return (df.format(date)) + String.valueOf(Math.random()).substring(2, 5);
    }

     //Generate a username for the student
    @Override
    public String genUsername() {
        String fullName = this.fullName.toLowerCase();
        String[] splitN = fullName.split(" ");
        String username = splitN[0].substring(0, 3) + this.numControl;
        return username;
    }

    // Generate a password for the student
    @Override
    public String genPassword() {
        String password = this.numControl + this.fullName.substring(0, 3);
        return password;
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


}
