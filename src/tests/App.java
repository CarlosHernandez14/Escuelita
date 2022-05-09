package tests;
import java.util.*;

import domain.Student;

import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        System.out.println(df.format(fecha));

        int opcion = 0, opcion2 = 0;
        do{
            opcion = mostrarMenu();
            switch(opcion){
                case 1:

                    break;
                case 2:
                    
                    break;
                case 3:

                    break;
                case 4:
                    
                    break;
                case 0: return;
            }
        } while (opcion > 0);
    }

    public static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("< (1). MindBox   (2). TeachBox   (3). Library   (4). Administration   (0). Salir  >");
        System.out.println();
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        if (opcion == 0) {
            return opcion;
        }
        return opcion;
    }


}