import java.util.Scanner;

// package interChangeRow;

public class reverseEachRow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.nextInt();
            }
        }
        swapMat(mat,n);
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
    public static void swapMat(int mat[][], int n){
        for(int row = 0;row<mat.length; row++){
            int left = 0, right = n-1;
            while(left<right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++;right--;
            }
        }
    }
}
