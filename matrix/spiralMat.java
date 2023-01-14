import java.util.Scanner;

public class spiralMat {
    public static void spiralMatrix(int[][] mat, int rows, int cols) {
        int firstRow = 0, lastRow = rows - 1;
        int firstCol = 0, lastCol = cols - 1;

        while (firstRow <= lastRow && firstCol <= lastCol) {
            // TOP WALL: Left to Right
            for (int col = firstCol; col <= lastCol; col++) {
                System.out.print(mat[firstRow][col] + "   ");
            }

            firstRow++; // SKIP THE TOP RIGHT CORNER

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // RIGHT WALL: Top to Bottom
            for (int row = firstRow; row <= lastRow; row++) {
                System.out.print(mat[row][lastCol] + "   ");
            }

            lastCol--; // SKIP THE BOTTOM RIGHT CORNER

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // BOTTOM WALL: Right to Left
            for (int col = lastCol; col >= firstCol; col--) {
                System.out.print(mat[lastRow][col] + "   ");
            }

            lastRow--; // SKIP THE BOTTOM LEFT CORNER

            if (firstRow > lastRow || firstCol > lastCol)
                break;

            // LEFT WALL: Bottom to Top
            for (int row = lastRow; row >= firstRow; row--) {
                System.out.print(mat[row][firstCol] + "   ");
            }

            firstCol++; // SKIP THE TOP LEFT CORNER
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();

        int[][] mat = new int[rows][cols];
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                mat[row][col] = scn.nextInt();
            }
        }

        spiralMatrix(mat, rows, cols);
    }
}
