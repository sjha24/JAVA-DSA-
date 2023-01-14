import java.util.Scanner;

public class printFreqOfAlphabetStr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch-'a']>0){
                System.out.println(ch+" "+freq[ch-'a']);
                freq[ch-'a'] = -1;
            }
        }
    }
}
