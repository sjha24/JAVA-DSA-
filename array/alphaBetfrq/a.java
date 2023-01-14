import java.util.Scanner;

// package alphaBetfrq;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int res[] = frq(str);
        printFreq(str, res);
    }
    public static int[] frq(String str){
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        return freq;
    }
    public static void printFreq(String str, int fre[]){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(fre[ch - 'a']>0){
                System.out.println(ch +"-"+fre[ch - 'a']);
                fre[ch - 'a'] = -1;
            }
        }
    }
}
