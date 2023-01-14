import java.util.Scanner;

// package subArr;

public class printSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int [n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        printSubArray(arr);
    }
    public static void printSubArray(int arr[]){
        for(int start = 0;start<arr.length; start++){
            for(int end = start; end<arr.length; end++){
                for(int k = start; k<=end; k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
        }
    }
}
