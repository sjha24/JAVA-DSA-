
// import java.io.*;
import java.util.*;

public class swap {

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }

        }
        return max;
    }

    public static int minimum(int[] arr) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

        }
        return min;
    }

    public static void Swap(int[] arr) {

        int max = max(arr);
        int min = minimum(arr);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == max) {

                arr[i] = min;
            } else if (arr[i] == min) {

                arr[i] = max;
            }
            System.out.print(arr[i] + " ");
        }

    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        Swap(arr);
    }
}