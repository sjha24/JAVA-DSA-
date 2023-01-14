//kedan algorithum.
import java.util.Scanner;

public class MaxSubArray2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(MaxSubarray(arr));
    }
    public static int MaxSubarray(int[]arr){
        int maxSum = Integer.MIN_VALUE;
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum = Math.max(arr[i], sum+arr[i]);
            maxSum = Math.max(maxSum, sum);
        }
        
        return maxSum;
    }
}
