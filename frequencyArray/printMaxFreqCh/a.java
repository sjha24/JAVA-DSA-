import java.util.Scanner;

// package printMaxFreqCh;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = findMaxFreq(str);
        System.out.println(mostFrequentChar(freq));
    }
    public static int[] findMaxFreq(String str){
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        return freq;
    }
    public static char mostFrequentChar(int freq[]){
        int maxfreq = 0;
        char res = 'n';
        for(int i = 0; i<freq.length; i++){
            if(freq[i]>maxfreq){
                maxfreq = freq[i];
                res = (char)(i + 'a');
            }
        }
        return res;
    }
}
