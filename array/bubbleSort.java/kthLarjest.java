import java.util.Scanner;

// package bubbleSort.java;

public class kthLarjest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
      
        System.out.println(kthLarjest(arr, k));
    }

    public static int kthLarjest(int arr[], int k) {
        for (int left = 0; left < k; left++) {
            for (int right = 0; right < arr.length - 1 - left; right++) {
                if (arr[right] > arr[right + 1]) {
                    int swap = arr[right];
                    arr[right] = arr[right + 1];
                    arr[right + 1] = swap;
                }
            }
        }
        return arr[arr.length - k];
    }
}
