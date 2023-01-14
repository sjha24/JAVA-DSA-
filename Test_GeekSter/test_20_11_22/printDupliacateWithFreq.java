import java.util.Scanner;

public class printDupliacateWithFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int freq[] = freqOFDigit(arr);
        printDupliacatefreq(freq);
    }
    public static int[] freqOFDigit(int arr[]){
        int freq[] = new int[10];
        for(int i = 0; i<arr.length; i++){
            freq[arr[i]]++;
        }
        return freq;
    }
    public static void printDupliacatefreq(int freq[]){
        for(int i = 0; i<freq.length; i++){
            if(freq[i]>1){
                System.out.println(i+"->"+freq[i]);
            }
        }
    }
}
