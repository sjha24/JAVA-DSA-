import java.util.Scanner;

// package sortingAlgo;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<n; i++){
            arr[i] = scn.nextInt();
        }
        BubbleSort(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void BubbleSort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0 ; j<arr.length-i-1; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
