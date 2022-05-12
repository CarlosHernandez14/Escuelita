package Platform;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

import domain.Course;
import domain.Professor;
import domain.Student;

public class Platform {
    private String institute;
    private String address;
    private String phone;
    private String email;
    private ArrayList<Course> courses;
    private Map<String, String> studentsMindBox;  
    private Map<String, String> teachersMindBox;

    // Constructor
    public Platform(String institute, String address, String phone, String email) {
        this.institute = institute;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.courses = new ArrayList<Course>();
    }
    public Platform(String institute, String address, String phone, String email, ArrayList<Course> courses) {
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
        for (Course course : courses) {
            System.out.println(course.getCourseName());
        }
    }

    // Capture all information
    public void capture() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the institute: ");
        institute = sc.nextLine();
        System.out.println("Enter the address: ");
        address = sc.nextLine();
        System.out.println("Enter the phone: ");
        phone = sc.nextLine();
        System.out.println("Enter the email: ");
        email = sc.nextLine();
        sc.close();
    }

    // LOGIN
    public void login() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the username: ");
        String username = sc.nextLine();
        System.out.println("Enter the password: ");
        String password = sc.nextLine();

        if (studentsMindBox.containsKey(username)) {
            if (studentsMindBox.get(username).equals(password)) {
                System.out.println("Welcome, " + username);
                // TODO: Show the student information

            } else {
                System.out.println("Wrong password");
            }
        } else if (teachersMindBox.containsKey(username)) {
            if (teachersMindBox.get(username).equals(password)) {
                System.out.println("Welcome, " + username);
                // TODO: Show the teacher's courses
                
            } else {
                System.out.println("Wrong password");
            }
        } else {
            System.out.println("User not found");
        }
        sc.close();
    }

    // Register a new course
    public void registerCourse(Course course) {
        Scanner sc = new Scanner(System.in);
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
        Course newCourse = new Course(courseName, subjects, prospectTeachers);
        // Add the course to the platform
        this.courses.add(newCourse);
        sc.close();
    }

    // Register a new student
    public void registerStudent(Student student) {
        Scanner sc = new Scanner(System.in);
        Student newStudent = new Student();
        newStudent.capture();
        this.studentsMindBox.put(newStudent.genUsername(), newStudent.genPassword());
        sc.close();
    }

    // Register a new professor
    public void registerProfessor(Professor professor) {
        Scanner sc = new Scanner(System.in);
        Professor newProfessor = new Professor();
        newProfessor.capture();
        this.teachersMindBox.put(newProfessor.genUsername(), newProfessor.genPassword());
        sc.close();
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

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
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
}
