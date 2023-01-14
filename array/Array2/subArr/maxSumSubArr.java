import java.util.Scanner;

public class maxSumSubArr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        maxSumSubArray(arr);
        maxSumSubArray2(arr);
    }
    //appoarch -1
    public static void maxSumSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int s = 0; s<arr.length; s++){
            int sum = 0;
            for(int e = s; e<arr.length; e++){
                sum = sum +arr[e];
                if(sum>maxSum){
                    maxSum = sum;
                }
            }
        }
        System.out.println(maxSum);
    }
    //appoarch - 2
    public static void maxSumSubArray2(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        for(int s = 0; s<arr.length; s++){
            int sum = 0;
            for(int e = s; e<arr.length; e++){
                sum = sum +arr[e];
                maxSum = Math.max(sum, maxSum);
            }
        }
        System.out.println(maxSum);
    }
}