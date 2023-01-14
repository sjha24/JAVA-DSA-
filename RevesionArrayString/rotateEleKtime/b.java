import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        int rotation = k % n;
        for(int i = 0; i<rotation; i++){
            rotate(arr, n);
        }
        for(int i =0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void rotate(int arr[], int n){
        int temp = arr[n-1];
        for(int i = n - 1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
