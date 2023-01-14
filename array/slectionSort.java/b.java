import java.util.Scanner;

// package slectionSort.java;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        slectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void slectionSort(int arr[]){
        for(int left = 0; left<arr.length; left++){
            int minIdx = left;
            for(int right = left +1; right<arr.length; right++){
                if(arr[right]<arr[minIdx]{
                    minIdx = right
                }
            }
        }
        int temp = arr[left];
        arr[left] = arr[minIdx];
        arr[minIdx] = temp;
    }
}
