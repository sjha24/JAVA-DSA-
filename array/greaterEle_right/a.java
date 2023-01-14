import java.util.Scanner;

// package greaterEle_right;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i  =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solve(arr);
    }
    public static void solve(int arr[]){
        for(int left = 0; left<arr.length; left++){
            int count = greaterAtRight(arr, arr[left], left);
            System.out.print(count+" ");
        }
    }
    public static int greaterAtRight(int arr[], int target, int left){
        int count = 0;
        for(int right = left+1; right<arr.length; right++){
            if(arr[right]>target)count++;
        }
        return count;
    }
}
