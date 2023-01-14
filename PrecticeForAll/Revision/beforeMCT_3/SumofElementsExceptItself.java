import java.util.Scanner;

public class SumofElementsExceptItself {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            int sum = 0,ans=0;
            int j;
            for(j = 0; j<arr.length; j++){
                sum +=arr[j];
            }
            ans = sum-arr[i];
            System.out.println(ans);
        }
    }
}