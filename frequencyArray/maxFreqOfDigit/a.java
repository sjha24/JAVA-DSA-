import java.util.Scanner;

// package maxFreqOfDigit;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int freq[] = FreqOfArr(arr);
        System.out.println(mostfrequencyOfDigit(freq));
    }
    public static int[] FreqOfArr(int arr[]){
        int freq[] = new int[10];
        for(int i = 0;i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static int mostfrequencyOfDigit(int freq[]){
        int maxFreq = 0;
        int res = 0;
        for(int i = 0; i<freq.length; i++){
            // System.out.println(freq[i]+" ");
            if(freq[i]>maxFreq){//freq[i]>freq[res];
                maxFreq = freq[i];//no need this line if freq[res] implement
                // System.out.println(maxFreq);
                res = i;
            }
        }
        return res;
    }
}
