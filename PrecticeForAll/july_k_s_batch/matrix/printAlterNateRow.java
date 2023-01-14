import java.util.Scanner;

public class printAlterNateRow{
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
        for(int row = 0; row<rows; row+=2){
            for(int col = 0; col<cols; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}