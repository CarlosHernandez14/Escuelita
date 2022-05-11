package tests;

import java.util.*;


import domain.Course;
import domain.Professor;

public class MethodTests {
    public static void main(String[] args) {
        // Test class course
        String[] subjects = {"Calculo Integral", "Algebra Lineal", "Contabilidad", "Quimica"};
        ArrayList<String> subjectsList = new ArrayList<>(Arrays.asList(subjects));
        // NEW PROFESSOR
        Professor p1 = new Professor();
        p1.setfullName("Aburto");
        p1.setBirthDate(new Date());
        Professor p2 = new Professor();
        p2.setfullName("Pedro");
        p2.setBirthDate(new Date());
        Professor p3 = new Professor();
        p3.setfullName("Carlos");
        p3.setBirthDate(new Date());
        Professor p4 = new Professor();
        p4.setfullName("Juan");
        p4.setBirthDate(new Date());
        Professor p5 = new Professor();
        p5.setfullName("Luis");
        p5.setBirthDate(new Date());
        Professor p6 = new Professor();
        p6.setfullName("Valeria");
        p6.setBirthDate(new Date());

        Professor[] professors = {p1, p2, p3, p4, p5, p6};
        ArrayList<Professor> professorsList = new ArrayList<>(Arrays.asList(professors));
        Course sistemas = new Course("Sistemas",subjectsList, professorsList);
        sistemas.assingProfessors();
        sistemas.show();
    }
}
