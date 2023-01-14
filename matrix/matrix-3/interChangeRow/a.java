import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        interchangeRow(mat);
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                System.out.print(mat[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void interchangeRow(int mat[][]) {
        for (int col = 0; col < mat[0].length/2; col++) {
                int temp = mat[0][col];
                mat[0][col] = mat[mat.length - 1][col];
                mat[mat.length - 1][col] = temp;
        }
    }
}