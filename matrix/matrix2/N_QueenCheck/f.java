import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0; row<N; row++){
            for(int col =0; col<N;col++){
                mat[row][col] = scn.nextInt();
            }
        }
        for(int row = 0; row<mat.length; row++){
            for(int col = 0; col<mat[0].length; col++){
                if(mat[row][col]==1 && checkQueen(mat,row,col) == false){
                    System.out.println("Danger");
                    return;
                }
            }
        }
        System.out.println("N Queens");
    }

    public static boolean checkQueen(int mat[][], int rows, int cols){
        //left

        // for(int row = rows, col = cols-1 ; col>=0;col--) {
        //     if(mat[row][col]==1)return false;
        // }

        //right
        for(int row = rows, col = cols+1;col<mat[0].length; col++){
            if(mat[row][col]==1)return false;
        }

        //up
        // for(int row = rows-1, col = cols;row>=0; row--){
        //     if(mat[row][col]==1)return false;
        // }

        //down
        for(int row = rows+1, col = cols; row<mat.length; row++){
            if(mat[row][col]==1)return false;
        }
        // //left up
        // for(int row = rows -1,col = cols-1;row>=0 && col>=0;row--,col--){
        //     if(mat[row][col]==1)return false;
        // }

        //down right
        for(int row = rows+1, col = cols+1; col<mat[0].length && row<mat.length; col++, row++){
            if(mat[row][col]==1)return false;
        }
        // //up right
        // for(int row = rows -1, col = cols+1 ; row>=0 && col<cols; row--, col++){
        //     if(mat[row][col]==1)return false;
        // }

        //down left
        for(int row = rows+1, col = cols-1; row<mat.length && col>=0;row++, col--){
            if(mat[row][col]==1)return false;
        }
        return true;  
    }
}
