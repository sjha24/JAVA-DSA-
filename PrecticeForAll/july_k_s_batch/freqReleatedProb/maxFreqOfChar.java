import java.util.Scanner;

public class maxFreqOfChar{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        char ch = str.charAt(0);
        int max = freq[ch-'a'];
        for(int i = 0; i<str.length(); i++){
            char ch1 = str.charAt(i);
            if(freq[ch1-'a']>max){
                max = freq[ch1 -'a'];
            }
        }
        for(int i = 0; i<str.length(); i++){
            char ch2 = str.charAt(i);
            if(freq[ch2-'a']==max){
                System.out.println(ch2);
                freq[ch2-'a'] = -1;
            }
        }
    }
}