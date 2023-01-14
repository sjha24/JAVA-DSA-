import java.util.Scanner;

public class printRowWiseMat_withCon {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt(), cols = scn.nextInt();
        int mat[][] = new int [rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        for(int row = 0; row<rows; row++){
            if(row % 2 == 0){
                for(int col = 0 ; col<cols; col++){
                    System.out.print(mat[row][col]+" ");
                }
            }else{
                for(int col = cols - 1; col>=0; col--){
                    System.out.print(mat[row][col]+" ");
                }
            }
            System.out.println();
        }
    }       
}
