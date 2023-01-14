import java.util.Scanner;

public class printMatin_X_shape{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n;col++){
                mat[row][col] = scn.nextInt();
            }
        }
        printMatX(mat,n);
    }
    public static void printMatX(int mat[][], int n){
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n;col++){
                if(row==col || row+col == n-1){
                    System.out.print(mat[row][col]+"\t");
                }else{
                    System.out.print(" \t");
                }
            }
            System.out.println();
        }
    }
}