import java.util.Scanner;

import javax.lang.model.element.Element;

// package segregatePlus_minus;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        segregateValue(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    
    public static void segregateValue(int arr[]) {
        int pivote = arr[arr.length - 1];
        int left = 0, right = 0;
        while (right < arr.length) {
            if (arr[right] >= pivote) {
                swap(arr, left, right);
                right++;left++;
            }else{
                right++;
            }
        }
    }
    public static void swap(int arr[], int p1, int p2) {
        int temp = arr[p1];
        arr[p1] = arr[p2];
        arr[p2] = temp;
    }
}
