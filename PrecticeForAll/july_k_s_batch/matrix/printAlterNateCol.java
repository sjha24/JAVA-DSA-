import java.util.Scanner;

public class printAlterNateCol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int i = 0; i<rows; i++){
            for(int j = 0; j<cols; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        for(int col = 0; col<cols; col+=2){
            for(int row = 0; row<rows; row++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}
