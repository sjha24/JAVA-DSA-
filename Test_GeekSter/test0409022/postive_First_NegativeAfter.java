import java.io.*;
import java.util.*;

public class Solution {
public static boolean positiveFirstArr(int[] arr)
    {
        int j = 0, temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (i != j) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    return false;
                }
                j++;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for(int idx = 0; idx < arr.length; idx++) {
            arr[idx] = sc.nextInt();
        }
        System.out.println(positiveFirstArr(arr));
    }
}