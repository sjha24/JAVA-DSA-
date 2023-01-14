import java.util.Scanner;

// package bubbleSort.java;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        bubbleSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void bubbleSort(int arr[]){
        for(int left = 0; left<arr.length-1; left++){
            for(int right = 0; right<arr.length-1-left; right++){
                if(arr[right]>arr[right+1]){
                    int temp = arr[right];
                    arr[right] = arr[right+1];
                    arr[right+1] = temp;
                }
            }
        }
    }
}
