import java.util.Scanner;

public class interChangeRow {
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
        InterChangeRow(mat, rows, cols);
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void InterChangeRow(int mat[][], int rows, int cols){
        for(int col = 0; col<cols; col++){
            int temp = mat[0][col];
            mat[0][col] = mat[rows-1][col];
            mat[rows-1][col] = temp;
        }
    }
}