import java.util.Scanner;

// package setMatZero;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        setMatZero(mat);
        //print---
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void makeRow0(int mat[][], int row){
        for(int col = 0; col<mat[0].length; col++){
            mat[row][col] = 0;
        }
    }
    public static void makeCol0(int mat[][], int col){
        for(int row = 0; row<mat.length; row++){
            mat[row][col] = 0;
        }
    }
    public static void setMatZero(int mat[][]){
        int rows = mat.length, cols = mat[0].length;
        int copy[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                copy[row][col] = mat[row][col];
            }
        }
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                if(copy[r][c]==0){
                    makeRow0(mat, r);
                    makeCol0(mat, c);
                }
            }
        }
    }
}
