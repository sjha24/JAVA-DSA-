import java.util.Scanner;

// import javax.xml.transform.Templates;

// package setMatZero;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int row = 0; row<n;row++){
            for(int col = 0; col<m; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        setZero(mat);
        //print-----
        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                System.out.print(mat[row][col]);
            }
            System.out.println();
        }
    }
    public static boolean isRow0(int mat[][], int row){
        for(int col = 0; col<mat[0].length; col++){
            if(mat[row][col]==0)return true;
        }
        return false;
    }
    public static boolean isCOl0(int mat[][], int col){
        for(int row = 0; row<mat.length; row++){
            if(mat[row][col]==0)return true;
        }
        return false;
    }
    public static void setZero(int mat[][]){
        int rows = mat.length, cols = mat[0].length;
        int copy[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                copy[row][col]= mat[row][col];
                if(isRow0(mat, row) == true || isCOl0(mat, col)==true){
                    copy[row][col] = 0;
                }
            }
        }
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = copy[row][col];
            }
        }
    }
}
