import java.util.Scanner;

// package slectionSort.java;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        SlectionSort(arr,k);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SlectionSort(int[] arr, int k){
        // int minVal = Integer.MAX_VALUE;
        for(int left = 0; left<arr.length; left++){
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
        // System.out.println(arr[k-1]+"<-min");
    }
}
