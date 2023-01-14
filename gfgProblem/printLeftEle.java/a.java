import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

// package printLeftEle.java;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long arr[] = new long[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        leftEle(arr, n);
    }

    // Sort the array . If the value of N is odd then simply print the mid(n/2)
    // element in the new array.
    // If the value of N is even then print a[n/2-1] in the new array.
    public static long leftEle(long arr[], long n) {
        if (n % 2 == 0) {
           return Math.toIntExact(arr[(arr.length / 2) - 1]);
        } else {
            return Math.toIntExact(arr[arr.length / 2]);
        }
    }
}
