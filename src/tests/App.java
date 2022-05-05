package tests;
import java.util.*;
import java.text.SimpleDateFormat;
public class App {
    public static void main(String[] args) throws Exception {
        Date fecha = new Date();
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy");
        System.out.println(df.format(fecha));
    }
}