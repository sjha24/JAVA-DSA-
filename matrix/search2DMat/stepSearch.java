import java.util.Scanner;

// package search2DMat;

public class stepSearch {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int row = 0;row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        int target = scn.nextInt();
        // findEle(mat,target);
        System.out.println(findEle(mat, target));
    }
    public static boolean findEle(int mat[][],int target){
        int row = 0, col = mat[0].length-1;
        while(row<mat.length && col>=0){
            if(mat[row][col]<target){
                row++;
            }else if(mat[row][col]>target){
                col--;
            }else return true;//successful Search
        }
        return false;//unsuccessful search
    }
}
