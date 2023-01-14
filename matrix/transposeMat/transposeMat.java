package transposeMat;
import java.util.Scanner;

public class transposeMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int [N][N];
        for(int row = 0 ; row<N; row++){
            for(int col = 0 ; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        TransposeMatrix(mat, N);
        for(int row = 0 ; row<N; row++){
            for(int col = 0 ; col<N; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void TransposeMatrix(int[][]mat , int N){
        for(int row = 0; row<N; row++){
            for(int col =  row ; col<N; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
}
