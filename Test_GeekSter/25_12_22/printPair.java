import java.util.Scanner;

public class printPair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] =scn.nextInt();
        }
        int k = scn.nextInt();
        printPair(arr, k);
    }
    public static void printPair(int arr[], int k){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]+arr[j]==k){
                    System.out.println(arr[i]);
                }
            }
        }
    }
}
