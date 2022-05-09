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

        int opcion = 0, opcion2 = 0, opcion3= 0;
        do{
            opcion = mostrarMenu();
            switch(opcion){
                case 11:

                    break;
                case 12:
                    
                    break;
                case 13:

                    break;
                case 14:
                    
                    break;
                case 21:
                    
                    break;
                case 22:
                    
                    break;
                case 23:
                   
                    break;
                case 24:
                    
                    break;
                case 31:
                    opcion2 = mostrarMenu();
                    switch(opcion2){
                        case 1:
                            
                        case 2:
                            
                        case 3:
                            
                    }
                    break;
                case 32:
                    opcion3 = mostrarMenu();
                    switch(opcion3){
                        case 1:
                            
                            break;
                        case 2:
                            
                            break;
                        case 3:
                            
                            break;
                    }
                    break;
                case 33:
                    
                    break;
                case 34:
                    
                    break;
                case 41:
                    
                    break;
                case 42:
                    
                    break;
                case 0: return;
            }
        } while (opcion > 0);
    }

    public static int mostrarMenu() {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("<<< (1). Capturar Restaurante   (2). Capturar Menu   (3). Capturar Propietarios   (0). Salir  >>>  ");
        System.out.println();
        System.out.print("Seleccione una opcion: ");
        opcion = sc.nextInt();

        if (opcion == 0)
            return opcion;


        return opcion;
    }

    }
}