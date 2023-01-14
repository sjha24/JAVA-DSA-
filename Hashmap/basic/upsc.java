// package basic;
// import java.security.KeyStore.Entry;
import java.util.HashMap;
// import java.util.Scanner;

public class upsc {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        HashMap<String , Integer>sub = new HashMap<>();
        //insertion--->
        sub.put("Polity", 2);
        sub.put("Economic", 2);
        sub.put("History", 5);
        sub.put("Science", 1);
        sub.put("Geography", 1);
        sub.put("Current", 1);
        sub.put("Sociology", 1);
        sub.put("social issue", 1);
        sub.put("constitution", 1);
        sub.put("mordern history", 3);
        sub.put("acient history", 1);
        sub.put("medival history", 1);
        sub.put("Mordern world", 1);
        sub.put("hindi literature", 4);
        System.out.println(sub);
        //get key value
        System.out.println(sub.get("hindi literature"));
        System.out.println(sub.get("Current"));
        System.out.println(sub.get("tele"));//null
        //delete----->
        sub.remove("Sociology");
        sub.remove("polity");
        sub.remove("Mordern world");
        sub.remove("acient histroy");
        System.out.println(sub);
        System.out.println(sub.get(null));
        sub.put(null, 2);
        System.out.println(sub.get(null));
        //update value
        sub.put("Current", 5);
        System.out.println(sub);
        System.out.println(sub.get("Current"));
        for(String book : sub.keySet()){
            System.out.print(book+" : ");
            System.out.println(sub.hashCode());
            System.out.println(sub.get(book));
        }

    }
}
