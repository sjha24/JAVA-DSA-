// package basic;
import java.util.ArrayList;
import java.util.HashMap;
// import java.util.Scanner;

public class extraValue {
    public static void main(String[] args) {
        HashMap<String , ArrayList<String>>City = new HashMap<>();
        City.put("Bihar",new ArrayList<>());
        City.put("UP",new ArrayList<>());
        City.put("Haryana",new ArrayList<>());
        City.put("Gujrat",new ArrayList<>());
        City.put("Goa",new ArrayList<>());
        City.get("Bihar").add("Patna");
        City.get("Bihar").add("Begusarai");
        City.get("Bihar").add("Lakhisarai");
        City.get("Bihar").add("Kajra");
        City.get("Bihar").add("Bhagalpur");
        City.get("UP").add("Gorakhpur");
        City.get("UP").add("Ayodhya");
        City.get("UP").add("Noida");
        System.out.println(City);
    }
}
