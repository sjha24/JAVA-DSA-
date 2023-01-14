import java.util.Scanner;

public class maxFreq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int freq[] = new int[10];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < freq.length; i++) {
            if(freq[i]>max){
                max = i;
            }
        }
        System.out.println(max);
    }
}
