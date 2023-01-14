import java.util.Scanner;

public class modifyMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        modifyMatrix(mat, rows, cols);
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void modifyMatrix(int mat[][], int rows, int cols){
        boolean row[] = new boolean[rows];
        boolean col[] = new boolean[cols];
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                if(mat[r][c]==1){
                    row[r] = col[c] = true;
                }
            }
        }
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                if(row[i]==true || col[j]==true){
                    mat[i][j] = 1;
                }
            }
        }
    }
}
