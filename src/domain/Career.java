package domain;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class Career {
    private String courseName;
    private ArrayList<String> subjects;
    private ArrayList<Professor> prospectProfessors;
    private Map<String, Professor[]> currentProfessors;

    public Career() {
    }

    public Career(String courseName, ArrayList<String> subjects, ArrayList<Professor> prospectProfessors) {
        this.courseName = courseName;
        this.subjects = subjects;
        this.prospectProfessors = prospectProfessors;
        createCurrentProfessors();
    }

    public Map<String, Professor[]> getCurrentProfessors() {
        return currentProfessors;
    }

    public void assingProfessors() {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("<<<<<ASIGNING MENU>>>>>");
        do {
            System.out.println("-->>>Subject name: ");
            String sname = sc.nextLine();
            if (subjects.contains(sname)) {
                for (int i = 0; i < 3;) {
                    for(int j = 0; j < prospectProfessors.size(); j++) {
                        System.out.println(j + ".- " + prospectProfessors.get(j).getfullName());
                    }
                    System.out.println("Select a professor: ");
                    int pSelected = Integer.parseInt(sc.nextLine());
                    Professor p = prospectProfessors.get(pSelected);
                    if (p != null) {
                        currentProfessors.get(sname)[i++] = p;
                        prospectProfessors.get(i).addSubject(sname);
                        //prospectProfessors.remove(p);
                    }else
                        System.out.println("Professor not found");
                }
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
        // Crea un mapa de materias y array vacio de profesores para asignar
        currentProfessors = new HashMap<>();
        for (int i = 0; i < subjects.size(); i++) {
            currentProfessors.put(subjects.get(i), new Professor[3]); // Agrega las materias como keys, y un arrray de 3 profesores como value
        }

    }

    public Professor getSingleProfessor(String pname) {
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
        System.out.println("Course name: " + courseName);
        System.out.println("<<<<SUBJECTS - STUDY PLAN>>>>");
        subjects.forEach(System.out::println);
        System.out.println("<<<<CURRENT PROFESSORS>>>>");
        currentProfessors.forEach((k, v) -> {
            System.out.println("Subject: " + k);
            for (Professor p : v) {
                if (p != null) {
                    System.out.println("Professor: " + p.getfullName());
                } else {
                    System.out.println("Professor not assigned");
                }
            }
            System.out.println("------------------------");
        });
    }

    public void capture() {
        boolean end = false;
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE SUBJECTS COURSE - Type 'end' to finish");
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