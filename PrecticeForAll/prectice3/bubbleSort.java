import java.util.Scanner;

public class bubbleSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        BubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void BubbleSort(int[] arr) {
        for (int outer = 0; outer < arr.length - 1; outer++) {
            for (int inner = 0; inner < arr.length - outer - 1; inner++) {
                if (arr[inner] > arr[inner + 1]) {
                    int swap = arr[inner];
                    arr[inner] = arr[inner + 1];
                    arr[inner + 1] = swap;
                }
            }
        }
    }
}