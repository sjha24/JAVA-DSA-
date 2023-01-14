import java.util.Scanner;

public class maxFreqCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int[] freq = FrequencyArr(str);
        System.out.println(printMaxFrqOf_char(freq));
    }
    public static int[] FrequencyArr(String str){
        int[] frq = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            frq[ch-'a']++;
        }
        return frq;
    }
    public static char printMaxFrqOf_char(int[] freq){
        char res = 'N';
        int maxFrq = 0;
        for(int i = 0; i<26; i++){
            if(freq[i]>maxFrq){
                maxFrq = freq[i];
                res = (char)(i +'a'); 
            }
        }
        return res;

    }
}