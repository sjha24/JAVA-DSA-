import java.util.Scanner;

public class approach1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int [size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = convertTo(arr, rows, cols);
    }
    public static int[][] convertTo(int mat[][], int rows, int cols){
        
    }
}