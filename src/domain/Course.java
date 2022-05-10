package domain;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;


public class Course {
    private String courseName;
    private ArrayList<String> subjects;
    private ArrayList<Professor> prospectProfessors;
    private Map<String, Professor[]> currentProfessors;

    public Course() {
    }

    public Course(ArrayList<String> subjects, ArrayList<Professor> prospectProfessors) {
        this.subjects = subjects;
        this.prospectProfessors = prospectProfessors;
        createCurrentProfessors();
    }

    public Map<String, Professor[]> getCurrentProfessors() {
        return currentProfessors;
    }

    public void assingProfessors() {
        boolean end = false;
        Professor[] professors = new Professor[3];
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<ASIGNING MENU>>>>>");
        do {
            System.out.println("Subject name: ");
            String sname = sc.nextLine();
            if (subjects.contains(sname)) {
                for (int i = 0; i < professors.length;) {
                    System.out.print("Professor name: ");
                    Professor p = getSingleProfessor(sc.nextLine());
                    if (p != null) {
                        professors[i++] = p;
                    }else
                        System.out.println("Professor not found");
                }
                currentProfessors.put(sname, professors);
            } else {
                System.out.println("The subject does not exist");
            }
            System.out.println("Do you want to continue? (yes/no)");
            String answer = sc.nextLine();
            if (answer.equalsIgnoreCase("no")) {
                end = true;
            }
        } while (end == false);
        sc.close();
    }

    private void createCurrentProfessors() {
        currentProfessors = new HashMap<>();
        Professor[] cProfessors = new Professor[3];
        for (int i = 0; i < subjects.size(); i++) {
            currentProfessors.put(subjects.get(i), cProfessors);
        }
        
    }

    private Professor getSingleProfessor(String pname) {
        boolean isProfessor = false;
        Professor professor = null;
        for (Professor professor1 : prospectProfessors) {
            if (professor1.getfullName().equalsIgnoreCase(pname)) {
                professor = professor1;
                isProfessor = true;
            }
        }
        if (isProfessor) {
            return professor;
        }
        return null;
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