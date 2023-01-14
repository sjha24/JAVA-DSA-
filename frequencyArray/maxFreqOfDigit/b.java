import java.util.Scanner;

// package maxFreqOfDigit;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int freq[] = maxFreq(arr);
        System.out.println(mostfrequencyOfDigit(freq));
    }
    public static int[]  maxFreq(int arr[]){
        int freq[] = new int[10];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static int mostfrequencyOfDigit(int freq[]){
        int res = 0;
        for(int i = 0; i<freq.length; i++){
            if(freq[i]>freq[res]){
                res = i;
            }
        }
        return res;
    }
}
