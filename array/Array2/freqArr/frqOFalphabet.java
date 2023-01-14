import java.util.Scanner;

// package freqArr;

public class frqOFalphabet {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int frq[] = frqOFalphabet(str);
        printFreqArr(str, frq);
    }
    public static int[] frqOFalphabet(String str){
        int frq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            frq[ch-'a']++;
        }
        return frq;
    }
    public static void printFreqArr(String str, int frq[]){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(frq[ch-'a']>0){
                System.out.println(str.charAt(i)+"-"+frq[ch-'a']);
                frq[ch-'a'] = -1;
            }
        }
    }
}
