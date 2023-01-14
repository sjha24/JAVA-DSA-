import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        //print 
        transposeMat(mat, n);
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeMat(int mat[][], int n){
        //lower left mat -> col<row;
        for(int row = 0; row<n; row++){
            for(int col = 0; col<row; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
}
