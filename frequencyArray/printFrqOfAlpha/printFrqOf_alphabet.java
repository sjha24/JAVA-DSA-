import java.util.Scanner;

public class printFrqOf_alphabet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int[]freq = FrequencyArr(str);
        printFreqArr(str,freq);
    }
    public static int[] FrequencyArr(String str){
        int[] freq = new int[26];
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch - 'a']++;
        }
        return freq;
    }
    public static void printFreqArr(String str , int[] freq){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq[ch - 'a']>0){
                System.out.println(str.charAt(i)+"-"+freq[ch - 'a']);
                freq[ch - 'a'] = -1;
            }
        }
    }
}
