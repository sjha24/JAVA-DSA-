import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = FrequencyOf_Char(str);
        System.out.println(mostFrequentChar(freq));
    }
    public static int[] FrequencyOf_Char(String str){
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        return freq;
    }
    public static char mostFrequentChar(int freq[]){
        int mostfreq = 0;
        char res = 'n';
        for(int i = 0; i<freq.length; i++){
            if(freq[i]>=mostfreq){
                mostfreq = freq[i];
                res = (char)(i + 'a');
            }
        }
        return res;
    }
}
