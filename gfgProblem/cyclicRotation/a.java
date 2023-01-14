import java.util.Scanner;

// package cyclicRotation;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        cyclicRotation(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void cyclicRotation(int arr[]){
        int temp = arr[0];
        for(int i = 1; i<arr.length; i++){
            
        }
    }
}
