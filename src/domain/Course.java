package domain;

import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;


public class Course {
    private String courseName;
    private ArrayList<String> subjects;
    private ArrayList<Professor> prospectProfessors;
    private Map<String, Professor> currentProfessors;

    public Course() {
    }

    public Course(ArrayList<String> subjects, ArrayList<Professor> prospectProfessors) {
        this.subjects = subjects;
        this.prospectProfessors = prospectProfessors;
    }

    public Map<String, Professor> getCurrentProfessors() {
        return currentProfessors;
    }

    public void assingProfessors() {
        boolean isProfessor = false;
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<ASIGNING MENU>>>>>");
        System.out.println("<<<<<Write end to finish>>>>>");
        do {
            System.out.print("Professor name: ");
            String pname = sc.nextLine();
            System.out.println("Subject name: ");
            String sname = sc.nextLine();
            if (subjects.contains(sname)) {
                for (Professor professor : prospectProfessors) {
                    if (professor.getfullName().equalsIgnoreCase(pname)) {
                        currentProfessors.put(sname, professor);
                        prospectProfessors.remove(professor);
                        System.out.println("Professor assigned");
                        isProfessor = true;
                    }
                }
                if (isProfessor == false) {
                    System.out.println("Professor doesn't exist");
                }
            } else {
                System.out.println("The subject does not exist");
            }
        } while (end == false);
        sc.close();
    }

    // Show and capture methods
    public void show() {
        System.out.println("<<<<SUBJECTS>>>>");
        subjects.forEach(System.out::println);
        System.out.println("<<<<PROSPECT PROFESSORS>>>>");
        prospectProfessors.forEach(System.out::println);
    }

    public void capture() {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SUBJECTS COURSE - Type 'end' to finish");
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

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ArrayList<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(ArrayList<String> subjects) {
        this.subjects = subjects;
    }

    public ArrayList<Professor> getProspectProfessors() {
        return prospectProfessors;
    }

    public void setProspectProfessors(ArrayList<Professor> prospectProfessors) {
        this.prospectProfessors = prospectProfessors;
    }
}