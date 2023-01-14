// package basic;
import java.util.HashMap;
import java.util.Scanner;

public class country{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, String>capital = new HashMap<>();
        capital.put("India", "Delhi");
        capital.put("USA", "Washington DC");
        capital.put("Pak", "Islamabad");
        capital.put("Bangladesh", "Dhaka");
        System.out.println(capital.size());
        System.out.println(capital);
    }
}