import java.util.Scanner;

// package printColHavingEvenNum;

public class a {
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
        checkColHavingEvenNum(mat, rows, cols);
    }
    public static void checkColHavingEvenNum(int mat[][],int rows, int cols){
        for(int col = 0; col<cols; col++){
            int count = 0;
            for(int row = 0; row<rows; row++){
                if(mat[row][col]%2 !=0){
                    count++;
                }
            }
            if(count % 2==0){
                for(int row = 0; row<rows;row++){
                    System.out.print(mat[row][col]+"\t");
                }
                System.out.println();
            }
        }
    }
}
