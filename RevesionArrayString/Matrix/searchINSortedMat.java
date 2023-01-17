import java.util.Scanner;

public class searchINSortedMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int r =0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        int target = scn.nextInt();
        searchInSortedMatrix(mat, rows, cols, target);
    }
    public static void searchInSortedMatrix(int mat[][], int rows, int cols, int target){
        int col = cols-1;
        int row = 0;
        while(col>=0 && row<rows){
            if(mat[row][col]==target){
                System.out.println(row);
                System.out.println(col);
                return;
            }else if(mat[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("Not Found");
    }
}