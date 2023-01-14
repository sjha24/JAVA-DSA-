import java.util.Scanner;

public class interChangeRow {
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
        for (int col = 0; col < cols; col++) {
            swap(mat,col);
        }
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }

    public static void swap(int mat[][],int col) {
        int topRow = 0,lastRow = mat.length-1;
        int temp = mat[topRow][col];
        mat[topRow][col] = mat[lastRow][col];
        mat[lastRow][col] = temp;
    }
}
