package Platform;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import domain.Administrative;
import domain.Career;
import domain.Professor;
import domain.Student;

public class Platform {
    private Scanner sc = new Scanner(System.in);
    private String institute;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Career> courses;
    private Map<String, String> studentsMindBox;
    private ArrayList<Student> studentsRegistered;

    private Map<String, String> teachersMindBox;
    private ArrayList<Professor> teachersRegistered;

    private Map<String, String> adminMindBox;
    private ArrayList<Administrative> adminsRegistered;


    // Constructor
    public Platform(String institute, String address, String phone, String email) {
        studentsMindBox = new HashMap<>();
        teachersMindBox = new HashMap<>();
        adminMindBox = new HashMap<>();
        studentsRegistered = new ArrayList<>();
        teachersRegistered = new ArrayList<>();
        adminsRegistered = new ArrayList<>();
        this.institute = institute;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courses = new ArrayList<Career>();
    }

    public Platform(String institute, String address, String phone, String email, ArrayList<Career> courses) {
        studentsMindBox = new HashMap<>();
        teachersMindBox = new HashMap<>();
        adminMindBox = new HashMap<>();
        studentsRegistered = new ArrayList<>();
        teachersRegistered = new ArrayList<>();
        adminsRegistered = new ArrayList<>();
        this.institute = institute;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courses = courses;
    }

    // Show all information
    public void show() {
        System.out.println("Institute: " + institute);
        System.out.println("Address: " + address);
        System.out.println("Phone: " + phone);
        System.out.println("Email: " + email);
        System.out.println("Courses: ");
        for (Career course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Capture all information
    public void capture() {
        System.out.print("Enter the institute: ");
        institute = sc.nextLine();
        System.out.print("Enter the address: ");
        address = sc.nextLine();
        System.out.print("Enter the phone: ");
        phone = sc.nextLine();
        System.out.print("Enter the email: ");
        email = sc.nextLine();

    }

    // LOGIN
    public int login() {
        System.out.println();
        System.out.print("Enter the username: ");
        String username = sc.nextLine();
        System.out.print("Enter the password: ");
        String password = sc.nextLine();
        System.out.println();

        if (studentsMindBox.containsKey(username)) {
            if (studentsMindBox.get(username).equals(password)) {
                System.out.println("Welcome to MindBox, " + username);
                // TODO: Show the student information
                return 1;

            } else {
                System.out.println("<Wrong username or password>");
                return 0;
            }

        } else if (teachersMindBox.containsKey(username)) {
            if (teachersMindBox.get(username).equals(password)) {
                System.out.println("Welcome to TeachBox, " + username);
                // TODO: Show the teacher's courses
                return 2;
            } else {
                System.out.println("<Wrong username or password>");
                return 0;
            }

        } else if (adminMindBox.containsKey(username)) {
            if (adminMindBox.get(username).equals(password)) {
                System.out.println("Welcome ADMIN, " + username);
                return 3;
            } else {
                System.out.println("<Wrong username or password>");
                return 0;
            }
        } else {
            System.out.println("<User not found>");
            return 0;
        }
    }


    // Register a new course
    public void registerCourse(Career course) {
        String ans = "";
        ArrayList<String> subjects = new ArrayList<String>();
        ArrayList<Professor> prospectTeachers = new ArrayList<Professor>();

        System.out.println("=======Registering a new course======");
        System.out.print("Enter the course name: ");
        String courseName = course.getCourseName();
        System.out.println("<<<Subjects>>> - Type 'end' to finish");
        // Capture the subjects
        do {
            System.out.print("Enter the subject: ");
            subjects.add(sc.nextLine());
            System.out.println("Do you want to add another subject? (y/n)");
            ans = sc.nextLine();
        } while (ans.equalsIgnoreCase("y"));
        // Capture the teachers
        System.out.println("<<<Teachers>>> - Type 'end' to finish");
        do {
            Professor teacher = new Professor();
            teacher.capture();
            prospectTeachers.add(teacher);
            System.out.println("Do you want to add another teacher? (y/n)");
            ans = sc.nextLine();
        } while (ans.equalsIgnoreCase("y"));
        // Create the course
        Career newCourse = new Career(courseName, subjects, prospectTeachers);
        // Add the course to the platform
        this.courses.add(newCourse);

    }

    // Register a new student
    public void registerStudent() {

        Student newStudent = new Student();
        newStudent.capture();
        this.studentsRegistered.add(newStudent);
        this.studentsMindBox.put(newStudent.getUserName(), newStudent.getPassword());
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Student's Username: " + newStudent.getUserName() + "\nStudent's Password: " + newStudent.getPassword());
        System.out.println("----------------------------------");
        System.out.println();

    }

    // Register a new professor
    public void registerProfessor() {

        Professor newProfessor = new Professor();
        newProfessor.capture();
        this.teachersRegistered.add(newProfessor);
        this.teachersMindBox.put(newProfessor.genUsername(), newProfessor.genPassword());
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Professor Username: " + newProfessor.getUserName() + "\nProfessor Password: " + newProfessor.getPassword());
        System.out.println("----------------------------------");
        System.out.println();
    }

    // Register a new Admin
    public void registerAdmin() {

        Administrative newAdmin = new Administrative();
        newAdmin.capture();
        this.adminsRegistered.add(newAdmin);
        this.adminMindBox.put(newAdmin.genUsername(), newAdmin.genPassword());
        System.out.println();
        System.out.println("----------------------------------");
        System.out.println("Your Usermane is: " + newAdmin.getUserName() + "\nYour Password is: " + newAdmin.getPassword());
        System.out.println("----------------------------------");
        System.out.println();
    }


    // Verify if the student is registered and return the student
    public Student verifyStudent(String name) {
        for (Student student : studentsRegistered) {
            if (student.getfullName().equalsIgnoreCase(name)) {
                return student;
            }
        }
        return null;
    }

    // Getters and Setters
    public String getInstitute() {
        return institute;
    }

    public void setInstitute(String institute) {
        this.institute = institute;
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

    public ArrayList<Career> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Career> courses) {
        this.courses = courses;
    }

    public Map<String, String> getStudentsMindBox() {
        return studentsMindBox;
    }

    public void setStudentsMindBox(Map<String, String> studentsMindBox) {
        this.studentsMindBox = studentsMindBox;
    }

    public Map<String, String> getTeachersMindBox() {
        return teachersMindBox;
    }

    public void setTeachersMindBox(Map<String, String> teachersMindBox) {
        this.teachersMindBox = teachersMindBox;
    }

    public Map<String, String> getAdminMindBox() {
        return adminMindBox;
    }

    public void setAdminMindBox(Map<String, String> adminMindBox) {
        this.adminMindBox = adminMindBox;
    }
////////////////////////////////////////////////////////////////////////////////////////////
//    public void registerAdminTest() {
//
//        Administrative newAdmin = new Administrative("Octavio Pena", "loma Feliz", "4433674203", "octaivo@gmail.com", "jflasdf", "Administracion", "Generente", "5000", "vigente", "PEVO030416HMNXZCA2", "fjlads-rfc", "Gerente");
//        this.adminsRegistered.add(newAdmin);
//        this.adminMindBox.put(newAdmin.genUsername(), newAdmin.genPassword());
//        System.out.println();
//        System.out.println("----------------------------------");
//        System.out.println("Your Usermane is: " + newAdmin.getUserName() + "\nYour Password is: " + newAdmin.getPassword());
//        System.out.println("----------------------------------");
//        System.out.println();
//    }
//
//    public void registerStudentTest() {
//
//        Student newStudent = new Student("Octavio Pena", "Felipe Tinoco", "443387465", "cataku@outloo.com", "Sistemas", 2, 90.7, true, "HECGH0348023CSJ");
//        this.studentsRegistered.add(newStudent);
//        this.studentsMindBox.put(newStudent.getUserName(), newStudent.getPassword());
//        System.out.println();
//        System.out.println("----------------------------------");
//        System.out.println("Student's Username: " + newStudent.getUserName() + "\nStudent's Password: " + newStudent.getPassword());
//        System.out.println("----------------------------------");
//        System.out.println();
//
//    }

//    public void registerProfessorTest() {
//
//        Professor newProfessor = new Professor("Aburto alejandro", "nose", "4423245235", "aburtito@gmail.com", "ajfld", "Cubiculo", "Professor", "9000", "vigente", "ABJTO84203H", "jdsflad-rfc", "jdflka", "Calculo");
//        newProfessor.capture();
//        this.teachersRegistered.add(newProfessor);
//        this.teachersMindBox.put(newProfessor.genUsername(), newProfessor.genPassword());
//        System.out.println();
//        System.out.println("----------------------------------");
//        System.out.println("Professor Username: " + newProfessor.getUserName() + "\nProfessor Password: " + newProfessor.getPassword());
//        System.out.println("----------------------------------");
//        System.out.println();
//    }

}
