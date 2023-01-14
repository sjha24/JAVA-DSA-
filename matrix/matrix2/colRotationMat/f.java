import java.util.Scanner;

// package colRotationMat;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        for(int col = 0; col<N; col++){
            RotateCol(mat, col);
            if(checkColRotation(mat, 0, col)==true){
                System.out.println("true");
                break;
            }else{
                System.out.println("false");
                break;
            }
        }
    }
    public static boolean checkColRotation(int mat[][], int col1,int col2){
        for(int row =0; row<mat.length; row++){
            if(mat[row][col1] != mat[row][col2])return false;
        }
        return true;
    }
    public static void RotateCol(int mat[][], int col){
        int n = mat.length;
        int temp = mat[n-1][col];
        for(int row = n-1 ; row>0; row--){
            mat[row][col] = mat[row-1][col];
        }
        mat[0][col] = temp;
    }
}