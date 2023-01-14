import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows1 = scn.nextInt();
        int cols1 = scn.nextInt();
        int mat1[][] = new int[rows1][cols1];
        for(int row = 0 ; row<rows1; row++){
            for(int col = 0; col<cols1; col++){
                mat1[row][col] = scn.nextInt();
            }
        }
        int rows2 = scn.nextInt();
        int cols2 = scn.nextInt();
        int mat2[][] = new int[rows2][cols2];

        for(int row = 0 ; row<rows2; row++){
            for(int col = 0; col<cols2; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        matMultipication(mat1, mat2);
    }
    public static void matMultipication(int mat1[][], int mat2[][]){
        int r1 = mat1.length, c1 = mat1[0].length;
        int r2 = mat2.length, c2 = mat2[0].length;
        if(c1 != r2){
            System.out.println(-1);
            return;
        }
        int m3[][] = new int[r1][c2];
        for(int r = 0; r<r1; r++){
            for(int c = 0; c<c2; c++){
                for(int k = 0; k<r2;k++){//k<r2
                    m3[r][c] = m3[r][c] + mat1[r][k] * mat2[k][c];
                }
            }
        }
        for(int i = 0; i<m3.length ;i++){
            for(int j = 0; j<m3[0].length; j++){
                System.out.print(m3[i][j]+" ");
            }
            System.out.println();
        }
    }
}