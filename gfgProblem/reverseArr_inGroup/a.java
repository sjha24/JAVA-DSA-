// import java.util.ArrayList;
import java.util.Scanner;

// package reverseArr_inGroup;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int count = scn.nextInt();
        // ArrayList<Integer>arr = new ArrayList<>();
        int arr[] = new int[count];
        for(int i = 0; i<count; i++){
            // int val = scn.nextInt();
            // arr.add(val);
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        swap(arr, 0,k-1);
        swap(arr, k, arr.length-1);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void swap(int [] arr,int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
}
