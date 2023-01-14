import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<m; c++){
                mat[r][c] = scn.nextInt();
            }
        }
    }
    public static void printSpiralMat(int mat[][], int n, int m){
        int firstCol = 0, LastCol = m -1;
        int FirstRow = 0, lastRow = n-1;
        while(firstCol<=LastCol ||FirstRow<=lastRow ){
            for(int col = firstCol; col<LastCol; col++){
                System.out.print(mat[FirstRow][col]+" ");
            }
            FirstRow++;
            if(firstCol >LastCol || FirstRow>lastRow)break;
            for(int row = FirstRow ; row<=lastRow; row++){
                System.out.print(mat[row][LastCol]+" ");
            }
            LastCol--;
            if(firstCol>LastCol || FirstRow>lastRow)break;
            for(int col = LastCol ; col>=firstCol; col--){
                System.out.print(mat[lastRow][col]+" ");                
            }
            lastRow--;
            if(firstCol>LastCol || FirstRow>lastRow)break;
            for(int row = lastRow; row>=FirstRow; row--){
                System.out.print(mat[row][firstCol]+" ");
            }
            firstCol++;
        }
    }
}