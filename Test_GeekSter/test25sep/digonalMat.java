import java.util.Scanner;

public class digonalMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[][] matrix = new int[N][N];

        for (int row = 0; row < N; row++) {
            for (int col = 0; col < N; col++) {
                matrix[row][col] = scn.nextInt();
            }
        }
        printMatrixDiagonally(matrix, N);
        printLeftDigonal(matrix, N);
    }



    public static void printMatrixDiagonally(int[][] matrix, int N) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row == col) {
                    System.out.print(matrix[row][col]+" ");
                }
            }
        }
        System.out.println();
    }
    public static void printLeftDigonal(int[][] matrix, int N){
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix.length; col++) {
                if (row + col == N-1) {
                    System.out.print(matrix[row][col]+" ");
                }
            }
        }
    }
}