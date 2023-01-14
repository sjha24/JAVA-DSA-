import java.util.Scanner;

// package maxFreqOfDigit;

public class d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = FreqOfArr(str);
        System.out.println(mostfrequencyOfDigit(freq));
    }
    public static int[] FreqOfArr(String str){
        int freq[] = new int[10];
        for(int i= 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'0']++;
            // System.out.println(freq[ch]);
        }
        return freq;
    }
    public static int mostfrequencyOfDigit(int freq[]){
        int ans = 0;
        for(int i = 0;i<freq.length; i++){
            // System.out.print(freq[i]+" ");
            if(freq[i]>freq[ans]){
                ans = i;
            }
        }
        return ans;
    }
}
