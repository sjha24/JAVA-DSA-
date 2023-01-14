import java.util.Scanner;

// package sortingAlgo;

public class selectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        SelectionSort(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SelectionSort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minidx = i;
            for(int j = i + 1; j<arr.length; j++){
                if(arr[j]<arr[minidx]){
                    minidx =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minidx];
            arr[minidx] = temp;
        }
    }
}
