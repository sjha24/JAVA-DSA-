import java.util.HashMap;
import java.util.Scanner;

public class firstUniqueChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        HashMap<Character, Integer> freq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);
        }
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (freq.get(ch) == 1) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
