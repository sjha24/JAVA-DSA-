import java.util.Arrays;
import java.util.Scanner;

public class waveSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        WaveSortArr(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void WaveSortArr(int arr[]) {
        Arrays.sort(arr);
        for (int i = 1; i < arr.length; i+=2) {
            int temp = arr[i-1];
            arr[i-1] = arr[i];
            arr[i] = temp;

        }
    }
}
