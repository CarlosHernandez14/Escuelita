package tests;
import Platform.Platform;
import domain.Course;
import java.text.SimpleDateFormat;
import java.util.*;
import domain.*;

public class MethodTests {
    public static void main(String[] args) {
        // Platform tecnm = new Platform("Tecnologico de Morelia", "Avenida Tecnológico 1500", "443 312 1570", "morelia.tecnm@outlook.com");
        // Student student = new Student("Octavio Peña vazquez", "Loma feliz", "44334535", "Octaviogta@gmail.com", "Sistemas", 2, 3, true, "PEVO030416HMNXZCA2");

        // tecnm.registerStudent(student);
        // tecnm.getStudentsMindBox();
        // tecnm.login();

        // Test method capture birth date from person
        Student student = new Student();
        student.capture();

        student.show();
    }
}
