// import java.text.BreakIterator;
import java.util.HashMap;
import java.util.Scanner;

public class word_Meaning {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<String, String> dictionary = new HashMap<>();
        while(true){
            int n = scn.nextInt();
            if (n == 1) {
                String word = scn.next();
                String meaning = scn.next();
                dictionary.put(word, meaning);
            } else if (n == 2) {
                String word = scn.next();
                System.out.println(dictionary.getOrDefault(word, "-1"));
            } else if (n == 3) {
                String word = scn.next();
                dictionary.remove(word);
            }else break;
        }
        
    }
}
