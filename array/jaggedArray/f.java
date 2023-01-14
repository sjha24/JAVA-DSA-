import java.util.Scanner;

public class f{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int mat[][] = new int[5][];
        mat[0] = new int[5];
        mat[1] = new int[7];
        mat[2] = new int[5];
        mat[3] = new int[2];
        mat[4] = new int[8];
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[row].length; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}