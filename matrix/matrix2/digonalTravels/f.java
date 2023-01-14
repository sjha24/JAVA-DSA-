import java.util.Scanner;

// package digonalTravels;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
    }
    public static void printDiagonal(int mat[][]){
        int n = mat.length;
        for(int sum = 0; sum<=2*(n-1);sum++){

        }
    }
}
