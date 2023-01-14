import java.util.Scanner;

// package rotateMat90_degree;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        transposeMat(mat, N);
        reverseRowMat(mat, N);
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void transposeMat(int mat[][], int N){
        for(int row = 0; row<N; row++){
            for(int col = 0; col<row; col++){//col = row
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
    public static void reverseRowMat(int mat[][], int N){
        for(int row = 0; row<N; row++){
            int left = 0, right = N - 1;
            while(left<right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++; right--;
            }
        }
    }
}
