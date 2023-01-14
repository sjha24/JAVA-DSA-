import java.util.Scanner;

// package binarySearch;

public class binarSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(binarySearch(arr, k));
    }
    public static int binarySearch(int arr[], int k){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            if(arr[left]==k){
                left++;
                return left;
            }else{
                // left++;
                right--;
            }
        }
        return -1;
    }
}
