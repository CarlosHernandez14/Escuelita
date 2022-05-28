package tests;
import java.sql.SQLOutput;
import java.util.*;

import Platform.Platform;
import domain.Student;
import library.libraryManagement.Library;

import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        System.out.println(df.format(fecha));

        Platform tecnm = new Platform("Tecnologico de Morelia", "Avenida Tecnológico 1500", "443 312 1570", "morelia.tecnm@outlook.com");
        Library library = new Library("building A");
        int option = 0, option2 = 0, option3 = 0, option4 = 0, option5, option6 = 0;

        tecnm.registerAdmin();
        System.out.println("==================================");
        System.out.println("============= Log in =============");
        System.out.println("==================================");
        do{
            option = tecnm.login();
            switch(option){
                case 1:
                    option6 = studentMenu();
                    switch (option6){
                        case 1:

                            break;
                        case 2:

                            break;
                        case 3:

                            break;
                        case 4:

                            break;
                        case 5:

                            break;
                        case 0:

                            break;

                    }
                    break;

                case 2:
                    System.out.println("You are a teacher");
                    break;

                case 3:
                    option2 = adminMenu();
                    switch(option2){
                        case 1:
                            option3 = adminMindBox();
                            switch(option2){
                                case 1:
                                    tecnm.registerStudent();
                                break;
                            }
                            break;
                        case 2:
                            option4 = adminTeachBox();
                            switch(option4){
                                case 1:
                                    tecnm.registerProfessor();
                                    break;
                            }
                            break;
                        case 3:
                            option5 = adminLibrary();
                            switch(option5){
                                case 1:
                                    library.registerProduct();
                                    break;
                            }
                            break;
                    }
                    break;

                case 0:
            }
        } while (option == 0);
    }

    public static int studentMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). In progress    (2). About me   (3). Re-enrollment   (4). Kardex   (5). Teacher Evaluation   (0). Salir >");
        System.out.println();
        System.out.print("Select an option: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }

    public static int adminMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). MindBox   (2). TeachBox   (3). Library   (0). Salir >");
        System.out.println();
        System.out.print("Select an option: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }

    public static int adminMindBox() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). Register Student   (0). Salir >");
        System.out.println();
        System.out.print("Select an option: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }

    public static int adminTeachBox() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). Register Professor   (0). Salir >");
        System.out.println();
        System.out.print("Select an option: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }

    public static int adminLibrary() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). Register Product   (0). Salir >");
        System.out.println();
        System.out.print("Select an option: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }

}