import java.util.Scanner;
import java.util.TreeMap;

// package printFrqOfAlpha;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = printFrqOfAlphabet(str);
        for (int i = 0; i < freq.length; i++) {
            char ch = str.charAt(i);
            if(freq[ch-'a']>0){
                System.out.println(ch+"-"+freq[ch-'a']);
                freq[ch-'a'] = 0;
            }
        }
    }

    public static int[] printFrqOfAlphabet(String str) {
        int freq[] = new int[26];
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        return freq;
    }
}
