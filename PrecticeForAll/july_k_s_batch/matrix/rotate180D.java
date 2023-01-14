import java.util.Scanner;

public class rotate180D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        reverseRow(mat);
        reverseCol(mat);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void reverseCol(int mat[][]) {
        for (int col = 0; col < mat[0].length; col++) {
            int firstRow = 0, lastRow = mat.length - 1;
            while (firstRow < lastRow) {
                int temp = mat[firstRow][col];
                mat[firstRow][col] = mat[lastRow][col];
                mat[lastRow][col] = temp;
                firstRow++;lastRow--;
            }
        }
    }

    public static void reverseRow(int mat[][]) {
        for (int row = 0; row < mat.length; row++) {
            int FirstCol = 0, lastCol = mat[0].length - 1;
            while (FirstCol < lastCol) {
                int temp = mat[row][FirstCol];
                mat[row][FirstCol] = mat[row][lastCol];
                mat[row][lastCol] = temp;
                FirstCol++;
                lastCol--;
            }
        }
    }
}
