import java.util.Scanner;

public class countPalindromicRow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        int count = 0;
        for (int row = 0; row < rows; row++) {
            if (isPalindromicRow(mat, rows, cols, row) == true)
                count++;
        }
        System.out.println(count);
    }

    public static boolean isPalindromicRow(int mat[][], int rows, int cols, int row) {
        int left = 0, right = cols - 1;

        while (left < right) {
            if (mat[row][left] != mat[row][right])
                return false;
            left++;
            right--;
        }

        return true;
    }

}
