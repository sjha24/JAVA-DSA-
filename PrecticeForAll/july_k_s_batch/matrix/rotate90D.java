import java.util.Scanner;

public class rotate90D {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        transPoseMat(mat);
        reverseRow(mat);    
        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void transPoseMat(int mat[][]){
        for(int row = 0; row<mat.length; row++){
            for(int col = row; col<mat[0].length; col++){
                int temp = mat[row][col];
                mat[row][col] = mat[col][row];
                mat[col][row] = temp;
            }
        }
    }
    public static void reverseRow(int mat[][]){
        for(int row = 0; row<mat.length;row++){
            int FirstCol = 0,lastCol = mat[0].length-1;
            while(FirstCol<lastCol){
                int temp = mat[row][FirstCol];
                mat[row][FirstCol] = mat[row][lastCol];
                mat[row][lastCol] = temp;
                FirstCol++;lastCol--;
            } 
        }
    }
}