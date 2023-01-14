import java.util.Scanner;

public class maxSubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(maxSubArray(arr));
    }
    public static int maxSubArray(int arr[]){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        return maxSum;
    }
}
