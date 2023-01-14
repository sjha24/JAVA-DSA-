import java.util.Scanner;

// package rotateArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k % n;
        for(int i = 0; i<k; i++){
            rotateArr(arr);
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateArr(int arr[]){
        int n = arr.length;
        int temp = arr[n-1];
        for(int i = n-1; i>0; i--){
            arr[i] = arr[i-1];
        }
        arr[0] = temp;
    }
}
