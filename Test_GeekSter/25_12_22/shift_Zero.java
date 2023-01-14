import java.util.Scanner;

public class shift_Zero {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int mat[][] = new int[rows][];
        for(int row = 0; row<rows; row++){
            int cols = scn.nextInt();
            mat[row]  = new int[cols];
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        shiftZero(mat);
    }
    public static void shiftZero(int mat[][]){
        for(int row = 0; row<mat.length; row++){
            int count = 0;
            for(int col = 0; col<mat[0].length; col++){
                if(mat[row][col]==0){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
