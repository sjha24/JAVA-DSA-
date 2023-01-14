// package spiralMat;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0 ; row<rows;row++){
            for(int col = 0 ; col < cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        spiralMat(mat,rows,cols);
    }
    public static void spiralMat(int mat[][], int rows, int cols){
        int firstC = 0, lastC = cols - 1;
        int firstR = 0, lastR = rows - 1;
        while(firstR<=lastR && firstC<lastC){
            for(int col = firstC; col<=lastC; col++){
                System.out.print(mat[firstR][col]+"\t");
            }
            firstR++;
            if(firstR>lastR || firstC>lastC)break;
            
            for(int row = firstR; row<lastR; row++){
                System.out.print(mat[row][lastC]+"\t");
            }
            lastC--;
            
            if(firstR>lastR || firstC>lastC)break;
            
            for(int col = lastC; col>=firstC; col--){
                System.out.print(mat[lastR][col]+"\t");
            }
            lastR--;
            if(firstR>lastR || firstC>lastC)break;

            for(int row = lastR; row>=firstR; row--){
                System.out.print(mat[row][firstC]+"\t");
            }
            firstC++;
        }
    }
}
