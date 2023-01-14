import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chess[][] = new int[n][n];
        for(int row = 0 ; row<n; row++){
            for(int col = 0; col<n; col++){
                chess[row][col] = scn.nextInt();
            }
        }
        for(int row = 0 ; row<n; row++){
            for(int col = 0; col<n; col++){
                if(chess[row][col]==1 && SafeQueen(chess, row, col)==false){
                    System.out.println("Danger");
                    return;
                }
            }
        }
        System.out.println("N Queens");
    }
    public static boolean SafeQueen(int chess[][], int row, int col){
        //left
        for(int R = row,C = col - 1; C>=0;C--){
            if(chess[R][C]==1)return false;
        }
        //right
        for(int R = row,C = col + 1; C<chess[0].length;C++){
            if(chess[R][C]==1)return false;
        }
        //up
        for(int R = row-1,C = col; R>=0;R--){
            if(chess[R][C]==1)return false;
        }
        //down
        for(int R = row+1,C = col; R<chess.length;R++){
            if(chess[R][C]==1)return false;
        }
        //up right
        for(int R = row-1,C = col + 1; R>=0 && C<chess[0].length;R--,C++){
            if(chess[R][C]==1)return false;
        }
        //up left
        for(int R = row-1,C = col - 1; R>=0 && C>=0;R--,C--){
            if(chess[R][C]==1)return false;
        }
        //down right
        for(int R = row+1,C = col + 1;R<chess.length && C<chess[0].length;R++,C++){
            if(chess[R][C]==1)return false;
        }
        //down left
        for(int R = row+1,C = col - 1; R<chess.length && C>=0;R++,C--){
            if(chess[R][C]==1)return false;
        }
        return true;
    }
}