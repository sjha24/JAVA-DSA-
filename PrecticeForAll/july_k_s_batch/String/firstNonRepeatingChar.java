import java.util.Scanner;

public class firstNonRepeatingChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0;i<str.length(); i++){
            if(freq[str.charAt(i)-'a']==1){
                System.out.println(str.charAt(i));
                return;
            }
        }
        System.out.println(-1);
    }
}
