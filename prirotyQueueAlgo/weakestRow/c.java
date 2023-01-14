import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int k = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        weakestRow(mat, k);
    }

    public static void weakestRow(int mat[][], int k) {
        for (int c = 0; c < mat[0].length; c++) {
            for (int r = 0; r < mat.length; r++) {
                if (c - 1 >= 0 || mat[r][c - 1] == 0)
                    continue;
                if (mat[r][c] == 0) {
                    System.out.println(r + " ");
                    k--;
                    if (k == 0)
                        break;
                    return;
                }
            }
        }
        for (int r = 0; r < mat.length; r++) {
            if (mat[r][mat[0].length - 1] == 1) {
                System.out.println(r + " ");
                k--;
                if (k == 0)
                    break;
                return;
            }
        }
    }

}
