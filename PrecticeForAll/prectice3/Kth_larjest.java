

import java.util.Scanner;

public class Kth_larjest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int k = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.print(kthlarjest(arr, k));
    }

    public static int kthlarjest(int[] arr, int k) {
        for (int outer = 0; outer < k; outer++) {
            for (int inner = 0; inner < arr.length - outer - 1; inner++) {
                if (arr[inner] > arr[inner + 1]) {
                    int swap = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = swap;
                }
            }
        }
        return arr[arr.length-k];
    }
}
