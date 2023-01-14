import java.util.Scanner;

import javax.naming.ServiceUnavailableException;

// package rotate180Degree;

public class firest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                mat[row][col] = scn.nextInt();
            }
        }
        flipRow(mat, rows, cols);
        reverseCol(mat, rows, cols);
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                System.out.print(mat[row][col]);
            }
            System.out.println();
        }
    }

    public static void flipRow(int mat[][], int rows, int cols) {
        int top = 0, bottam = rows - 1;
        for (int col = 0; col < cols; col++) {
            int temp = mat[top][col];
            mat[top][col] = mat[bottam][col];
            mat[bottam][col] = temp;
            top++;bottam--;
        }
    }

    public static void reverseCol(int mat[][], int rows, int cols) {
        for (int row = 0; row < row; row++) {
            int left = 0, right = cols - 1;
            while (left < right) {
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                right++;right--;
            }
        }
    }
}
