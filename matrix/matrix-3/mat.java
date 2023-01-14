import java.util.Scanner;

public class mat {
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
        for (int r = 0; r < rows; r++) {
            if (r % 2 == 0) {
                for (int col = 0; col < cols; col++) {
                    System.out.print(mat[r][col] + " ");
                }
                System.out.println();
            } else {
                for (int col = cols-1; col >=0; col--) {
                    System.out.print(mat[r][col] + " ");
                }
                System.out.println();

            }
        }
    }
}
