import java.util.Arrays;
import java.util.Scanner;

// package halfAseending_halfDesending;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        bitonicArr(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bitonicArr(int arr[]){
        int n = arr.length;
        int left = n/2;
        int right = n-1;
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
}
