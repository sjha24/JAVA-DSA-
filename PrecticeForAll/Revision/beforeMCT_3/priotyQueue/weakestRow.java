import java.util.Scanner;

public class weakestRow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int k = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        weakestRows(mat, rows, cols, k);
    }

    public static void weakestRows(int mat[][], int rows, int cols, int k) {
        for (int col = 0; col < cols; col++) {
            for (int row = 0; row < rows; row++) {
                if ((col - 1) >= 0 && mat[row][col - 1] == 0)
                    continue;
                else if (mat[row][col] == 0) {
                    System.out.print(row + " ");
                    k--;
                    if (k == 0)
                        return;
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            if (mat[row][cols - 1] == 1) {
                System.out.print(row + " ");
                k--;
                if(k==0)return;
            }
        }
    }
}