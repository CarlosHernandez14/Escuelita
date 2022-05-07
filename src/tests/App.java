package tests;
import java.util.*;

import domain.Student;

import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner read = new Scanner(System.in);1
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        System.out.println(df.format(fecha));

    }
}