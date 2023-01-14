import java.util.Scanner;

// package setMatZero;

public class opti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        setMatZero(mat);
        for(int r = 0 ; r<mat.length; r++){
            for(int c = 0; c<mat[0].length; c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void setMatZero(int mat[][]){
        boolean rows[] = new boolean[mat.length];
        boolean cols[] = new boolean[mat[0].length];
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(mat[row][col] == 0){
                    rows[row] = cols[col] = true;//0
                }
            }
        }
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(rows[row]==true || cols[col]==true){
                    mat[row][col] = 0;
                }
            }
        }
    }
}
