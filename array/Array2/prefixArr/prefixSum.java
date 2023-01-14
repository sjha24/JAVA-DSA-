import java.util.Scanner;

// package prefixArr;

public class prefixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        int sum[] = prefixArrSum(arr,left,right);
        for(int i = 0; i<sum.length; i++){
            System.out.print(sum[i]+" ");
        }
    }
    public static int[] prefixArrSum(int arr[], int left, int right){
        int prefix[] = new int[arr.length];
        int sum = 0;
        for(int i = left; i<right; i++){
            sum  = sum +arr[i];
            prefix[i] = sum;  
        }
        return prefix;
    }
}
