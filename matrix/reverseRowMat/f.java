// package reverseRowMat;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R = scn.nextInt();
        int C = scn.nextInt();
        int mat[][] = new int[R][C];
        for(int row = 0 ; row<R; row++){
            for(int col = 0; col<C; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        reverseRow(mat,R,C);
    }
    public static void reverseRow(int mat[][], int R, int C){
        for(int row = 0; row<R; row++){
            for(int col = C -1 ; col>=0; col--){
                System.out.print(mat[row][col]+"\t");
            }
            System.out.println();
        }
    }
}
