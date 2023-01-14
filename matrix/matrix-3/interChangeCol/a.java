import java.util.Scanner;

// package interChangeCol;

public class a {
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
        interChangeCol(mat);
        for(int r = 0; r<n; r++){
            for(int c = 0; c<m; c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void interChangeCol(int mat[][]){
        for(int row = 0; row<mat.length; row++){
            int temp = mat[row][0];
            mat[row][0] = mat[row][mat[0].length-1];
            mat[row][mat[0].length-1] = temp;
        }
    }
}
