import java.util.Scanner;

// package kthSmallestEle;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(kthSmallestEle(arr, k)+"<min val");
    }
    public static int kthSmallestEle(int arr[], int k){
        for(int left = 0; left<k; left++){
            int miniMum = left;
            for(int right = left+1; right<arr.length; right++){
                if(arr[right]<arr[miniMum]){
                    miniMum = right;
                }
            }
            int temp = arr[left];
            arr[left] = arr[miniMum];
            arr[miniMum] = temp;
        }
        return(arr[k-1]);
    }
}
