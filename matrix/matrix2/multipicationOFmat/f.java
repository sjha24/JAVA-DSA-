import java.util.Scanner;

// package multipicationOFmat;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0 ;row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        int row2 = scn.nextInt();
        int col2 = scn.nextInt();
        int mat2[][] = new int[row2][col2];
        for(int row = 0 ;row<row2; row++){
            for(int col = 0; col<col2; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        matMultipication(mat, mat2);
    }
    public static void matMultipication(int mat[][], int mat2[][]){
        int r1 = mat.length, c1 = mat[0].length;
        int r2 = mat2.length, c2 = mat2[0].length;
        if(c1 != r2){
            System.out.println(-1);//not possible to matrix multipication
            return;
        }
        int mat3[][] = new int[r1][c2];//for resultant row of 1st mat * col of Second mat

        for(int row = 0 ; row<mat3.length; row++){
            for(int col = 0; col<mat3[0].length; col++){
                for(int S = 0; S<c1; S++){
                    mat3[row][col] = mat3[row][col]+(mat[row][S]*mat2[S][col]);
                }
            }
        }
        //printnig
        for(int row = 0; row<mat3.length; row++){
            for(int col = 0; col<mat3[0].length; col++){
                System.out.println(mat3[row][col]+" ");
            }
            System.out.println();
        }
    }
}
