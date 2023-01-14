import java.util.Scanner;

public class compareTwoMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows1 = scn.nextInt();
        int cols1 = scn.nextInt();
        int mat1[][] = new int[rows1][cols1];
        for(int row = 0 ; row<rows1; row++){
            for(int col = 0 ; col<cols1; col++){
                mat1[row][col] = scn.nextInt();
            }
        }
        int r2 = scn.nextInt();
        int c2 = scn.nextInt();
        int mat2[][] = new int[r2][c2];
        for(int row = 0 ; row<r2; row++){
            for(int col = 0 ; col<c2; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        System.out.println(isIdentical(mat1, mat2, rows1, r2, cols1, c2));
    }
    public static String isIdentical(int mat1[][] , int mat2[][], int rows1, int r2, int cols1, int c2){
        if(rows1 != r2 || cols1 != c2) return "Not Same";
        for(int row = 0 ; row<r2; row++){
            for(int col = 0 ; col<c2; col++){
                if(mat1[row][col] != mat2[row][col])
                return "Not Same";
            }
        }
        return "Same";
    }
}
