import java.util.Scanner;

public class rotateArray{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        
        int k = scn.nextInt();
        k = k % size;
        for(int i = 0 ; i<k; i++){
            rotateArray(arr);
        }
        //print---
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateArray(int[] arr){
        int N = arr.length;
        int temp = arr[0];
        for(int i = 1; i<N; i++){
            arr[i-1] = arr[i];
        }
        arr[N-1] = temp;
    }
}