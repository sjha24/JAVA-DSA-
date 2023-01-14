import java.sql.SQLRecoverableException;
import java.util.Scanner;

// package sortingAlgo;

public class insertionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        InsertionSortAlgo(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void InsertionSortAlgo(int arr[]){
        for(int i = 1; i<arr.length; i++){
            for(int j = i - 1;j>=0; j--){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else break;
            }
        }
    }
}
