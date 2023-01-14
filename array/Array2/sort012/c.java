// package sort012;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int arr[], int p1, int p2){
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
    public static void sort012(int arr[]){
        int left = 0, mid = 0,right = arr.length-1;
        while(mid<=right){
            if(arr[mid] == 0){
                swap(arr, left, mid);
                left++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, right);
                right--;
            }
        }
    }
}
