import java.util.Scanner;

public class maxSubArrSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int maxSum = Integer.MIN_VALUE;
        for(int st = 0; st<n; st++){
            int sum = 0;
            for(int end = st; end<n; end++){
                sum = sum+arr[end];
                if(sum>maxSum)maxSum = sum;
            }
        }
        System.out.println(maxSum);
    }
}
