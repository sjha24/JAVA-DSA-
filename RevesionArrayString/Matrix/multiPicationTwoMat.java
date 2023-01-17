import java.util.Scanner;

public class multiPicationTwoMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows1 = scn.nextInt();
        int cols1 = scn.nextInt();
        int mat1[][] = new int[rows1][cols1];
        for (int r = 0; r < rows1; r++) {
            for (int c = 0; c < cols1; c++) {
                mat1[r][c] = scn.nextInt();
            }
        }
        int rows2 = scn.nextInt();
        int cols2 = scn.nextInt();
        int mat2[][] = new int[rows2][cols2];
        for (int r = 0; r < rows2; r++) {
            for (int c = 0; c < cols2; c++) {
                mat2[r][c] = scn.nextInt();
            }
        }
        multiPicationOfTwoMat(mat1, mat2, rows1, cols1, rows2, cols2);
    }

    public static void multiPicationOfTwoMat(int mat1[][], int mat2[][], int rows1, int cols1, int rows2, int cols2) {
        if (cols1 != rows2) {
            System.out.println(-1);
            return;
        }
        int ans[][] = new int[rows1][cols2];
        for (int r = 0; r < rows1; r++) {
            for (int c = 0; c < cols2; c++) {
                for (int k = 0; k < cols1; k++) {// rows2
                    ans[r][c] = ans[r][c]+(mat1[r][k] * mat2[k][c]);
                }
            }
        }
        // print------->
        for (int r = 0; r < rows1; r++) {
            for (int c = 0; c < cols2; c++) {
                System.out.print(ans[r][c]+" ");
            }
            System.out.println();
        }
    }
}
