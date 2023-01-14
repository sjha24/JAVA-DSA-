import java.util.Scanner;

public class frqAlpha3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int frq[] = frqOfEle(str);
        printFrq(str, frq);
    }
    public static int[] frqOfEle(String str){
        int frq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            frq[ch-'a']++;
        }
        return frq;
    }
    public static void printFrq(String str, int frq[]){
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(frq[ch-'a']>0){
                System.out.println(ch+"-"+frq[ch-'a']);
                frq[ch-'a'] = -1;
            }
        }
    }
}
