import java.util.Scanner;

// package MshapeMat.java;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        boolean res = isMshape(mat, n);
        System.out.println(res); 
    }
    public static boolean isMshape(int mat[][], int n){
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(col==0 || col == n-1|| (row<=n/2) && (row == col ||row+col==n-1)){
                    if(mat[row][col]== 0){
                        return false;
                    }
                }else{
                    if(mat[row][col]==1)
                    return false;
                }
            }
        }
        return true;
    }
}
