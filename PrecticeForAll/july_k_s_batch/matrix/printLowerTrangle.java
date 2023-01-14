import java.util.Scanner;

public class printLowerTrangle {
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
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                if(c<=r){
                    System.out.print(mat[r][c]+" ");
                }else System.out.print(0+" ");
            }
            System.out.println();
        }
    }
}
