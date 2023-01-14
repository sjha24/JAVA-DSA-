import java.util.Scanner;

public class d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k % n;
        for(int i = 0; i<k; i++){
            rotate(arr);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        for(int i = 0; i<n-1; i++){
            arr[i] = arr[i+1];
        }
        arr[n-1] = temp;
    }
}
