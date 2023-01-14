import java.util.Scanner;
public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       int freq[] = maxFreq(n);
       System.out.println(mostfrequencyOfDigit(freq));
    }
    public static int[] maxFreq(int n){
        int freq[] = new int[10];
        while(n>0){
            freq[n % 10]++;
            n = n/10;
        }
        return freq;
    }
    public static int mostfrequencyOfDigit(int freq[]){
        int max = 0;
        for(int i = 0;i<freq.length; i++){
            if(freq[i]>freq[max]){
                max = i;
            }
        }
        return max;
    }
} 
