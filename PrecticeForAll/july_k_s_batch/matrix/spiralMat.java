import java.util.Scanner;

public class spiralMat {
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
        printSpiralMat(mat);
    }
    public static void printSpiralMat(int mat[][]){
        int colFirst = 0,lastCol = mat[0].length-1;
        int rowFirst = 0, lastRow = mat.length-1;
        while(rowFirst<=lastRow && colFirst<=lastCol){
            for(int col = colFirst; col<=lastCol;col++){
                System.out.print(mat[rowFirst][col]+" ");
            }
            rowFirst++;
            
            if(rowFirst>lastRow || colFirst>lastCol)break;
            
            for(int row = rowFirst;row<=lastRow;row++){
                System.out.print(mat[row][lastCol]+" ");
            }
            lastCol--;
            if(rowFirst>lastRow || colFirst>lastCol)break;
            
            for(int col = lastCol;col>=colFirst;col--){
                System.out.print(mat[lastRow][col]+" ");
            }
            lastRow--;
            if(rowFirst>lastRow || colFirst>lastCol)break;
            for(int row = lastRow; row>=rowFirst; row--){
                System.out.print(mat[row][colFirst]+" ");
            }
            colFirst++;
        }
    }
}
