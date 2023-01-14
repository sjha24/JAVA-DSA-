import java.util.Scanner;

public class reverseRow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        for(int row = 0; row<n;row++){
            swap(mat, row);
        }
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                System.out.print(mat[r][c]+"\t");
            }
            System.out.println();
        }
    }

    public static void swap(int mat[][], int row) {
        int firstCol = 0, lastCol = mat[0].length - 1;
        while (firstCol < lastCol) {
            int temp = mat[row][firstCol];
            mat[row][firstCol] = mat[row][lastCol];
            mat[row][lastCol] = temp;
            firstCol++;lastCol--;
        }
    }
}
