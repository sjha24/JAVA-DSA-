import java.util.Scanner;

public class optimise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        setZeroes(mat);
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]);
            }
            System.out.println();
        }
    }

    public static void setZeroes(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        boolean rowe[] = new boolean[rows];
        boolean colum[] = new boolean[cols];

        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (mat[row][col] == 0) {
                    rowe[row] = colum[col] = true;
                }
            }
        }
        for (int row = 0; row < rows; row++) {
            for (int col = 0; col < cols; col++) {
                if (rowe[row] == true || colum[col] == true)
                    mat[row][col] = 0;
            }
        }
    }
}
