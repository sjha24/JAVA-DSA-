// package shiftMatRow_wise;

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0 ; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        int K = scn.nextInt();
        shiftRow(mat,K);
        for(int row = 0 ; row<N; row++){
            for(int col = 0; col<N; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void reverseCol(int mat[][], int rows, int left, int right){
        while(left<right){
            int temp = mat[rows][left];
            mat[rows][left] = mat[rows][right];
            mat[rows][right] = temp;
            left++;right--;
        }
    }
    public static void shiftRow(int mat[][], int K){
        int N = mat.length;
        K = K%N;
        K = K -N//anticlockWise
        for(int row = 0; row<K; row++){
            reverseCol(mat, row , 0 , N - K - 1);
            reverseCol(mat, row, N - K , N - 1);
            reverseCol(mat, row, 0 , N - 1);
        }
    }
}
