import java.util.Scanner;

public class printPrefixSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        int ans[] = preFixSum(arr);
        for(int i = left; i<=right; i++){
            System.out.println(ans[i]);
        }
    }
    public static int[] preFixSum(int arr[]){
        int res[] = new int[arr.length];
        int sum = 0;
        for(int i = 0;i<arr.length; i++){
            sum+=arr[i];
            res[i] = sum;
        }
        return res;
    }
}
