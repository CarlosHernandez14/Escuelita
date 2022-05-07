package Platform;
import domain.*;
import java.util.*;

public class Library {
    private String apartment;
    private Employee librarian[] = new Employee[5];
    private ArrayList<String> books;

    public String getApartment() {
        return apartment;
    }

    public void setApartement(String apartment) {
        this.apartment = apartment;
    }

}