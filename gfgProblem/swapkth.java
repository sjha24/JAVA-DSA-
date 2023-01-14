import java.util.Scanner;

public class swapkth {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        swapkthEle(arr, k,n);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void swapkthEle(int arr[], int k, int n) {
        int temp = arr[k-1];
        arr[k-1] = arr[n-k];
        arr[n-k] = temp;
    }
}