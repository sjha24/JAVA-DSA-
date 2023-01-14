//convert1D_to2D_array;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<N;i++){
            arr[i] = scn.nextInt();
        }
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = convert2D(arr,rows,cols);
        for(int row = 0 ;row<rows; row++){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }

    }
    public static int[][] convert2D(int arr[], int rows, int cols){
        int mat[][] = new int[rows][cols];
        int i = 0;
        for(int row = 0; row<rows;row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = arr[i++];
            }
        }
        return mat;
    }
}
