import java.util.Scanner;

// package maxSubArrSum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        long ans = maxSubarraySum(arr, n);
        System.out.println(ans);
    }
    public static long maxSubarraySum(int arr[], int n){
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++){
            int sum = 0;
            for(int j = i; j<n; j++){
                sum = sum + arr[j];
                if(sum>maxSum)maxSum = sum;
            }
        }
        return maxSum;
    }
}
