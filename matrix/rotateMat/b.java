import java.util.Scanner;

// package rotateMat;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        for(int row = 0; row<n; row++){
            boolean equals = false;
            for(int k = 0; k<n; k++){
                rotate(mat, row);
                if(CompareMat(mat, 0, row)==true){
                    equals = true;
                    break;
                }
            }
            if(equals == false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static boolean CompareMat(int mat[][], int row1, int row2){
        for(int col = 0; col<mat[0].length; col++){
            if(mat[row1][col] != mat[row2][col])return false;
        }
        return true;
    }
    public static void rotate(int mat[][], int row){
        int temp = mat[row][mat[0].length-1];
        for(int col = mat[0].length -1 ; col>0; col--){
            mat[row][col] = mat[row][col-1];
        }
        mat[row][0] = temp;
    }
}