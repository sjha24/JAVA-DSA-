// package subArr;

import java.util.Scanner;

public class kadanAlgoMaxSumSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        maxSumSubArr(arr);
    }
    public static void maxSumSubArr(int arr[]){
        int maxSum = Integer.MIN_VALUE, sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(maxSum , sum);
        }
        System.out.println(maxSum);
    }
}
