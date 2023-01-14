import java.util.Scanner;

// package transposeMat;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        transposeMatrix(mat, n);
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeMatrix(int mat[][], int n){
        //uper left side-->col = row;
        for(int row = 0; row<n; row++){
            for(int col = row; col<n; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
}
