// package modifyMat;
//set matrix zero

import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        madifyMat(mat,rows,cols);
        for(int row = 0;row<rows; row++){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]);
            }
            System.out.println();
        }
    }
    public static boolean isRowZero(int mat[][], int row){
        for(int col = 0; col<mat[0].length; col++){
            if(mat[row][col]==0)return true;
        }
        return false;
    }
    public static boolean isColZero(int[][], int col){
        for(int row = 0; row<mat.length; row++){
            if(mat[row][col]==0)return true;
        }
        return false;
    }
    public static int[][] madifyMat(int[][]mat, int rows, int cols){
        int copy[][] = new int[rows][cols];
        for(int row= 0;row<rows; row++){
            for(int col = 0; col<cols; col++){
                copy[row][col] = mat[row][col];
                if(isRowZero(mat, row)==true || isColZero(mat, col)==true)
                copy[row][col] = 0;
            }
        }
        // for(int row = 0; row<rows; row++){
        //     for(int col = 0; col<cols; col++){
        //         mat[row][col] = copy[row][col];
        //     }
        // }
        return copy;
    }
}
