import java.util.Scanner;

public class nQueenCheck {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int chessBoard[][] = new int [n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                chessBoard[r][c] = scn.nextInt();
            }
        }
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                if(chessBoard[row][col] == 1 && isNQueenDanger(chessBoard, n, row, col) == false){
                    System.out.println("Danger");
                    return;
                }
            }
        }
        System.out.println("N Queens");
    }
    //<-----------------------------------------  using while loop ------------------------------------->
    public static boolean isNQueenDanger(int chessBoard[][],int n, int row, int col){
        //left
        int r = row, c = col-1;
        while(c>=0){
            if(chessBoard[r][c] == 1)return false;
            c--;
        }
        //left-down
        while(c>=0 && r<n){
            if(chessBoard[r][c]==1)return false;
            c--;r++;
        }
        //left-top
        while(c>=0 && r>=0){
            if(chessBoard[r][c]==1)return false;
            c--;r--;
        }
       r = row; c = col + 1;
       while(c<n){
            if(chessBoard[r][c]==1)return false;
            c++;
        }
        //top
      r = row -1;c = col;
        while(r>=0){
            if(chessBoard[r][c]==1)return false;
            r--;
        }
      //top - right
       while(r>=0 && c < n){
            if(chessBoard[r][c]==1)return false;
            r--;c++;
        }
      //top down
       r = row+1; c = col+1;
       while(r<n && c<n){
            if(chessBoard[r][c]==1)return false;
            r++;c++;
        }
       return true;
    }
    //<----------------------------------------- using for loop -------------------------------------------->
    public static boolean isSafe(int chessBoard[][], int n , int row, int col){
        //left
        for(int c = col-1,r = row; c>=0; c--){
            if(chessBoard[r][c]==1)return false;
        }
        //left top
        for(int c = col - 1, r = row-1 ; c>=0 && r>=0 ; c--,r--){
            if(chessBoard[r][c]==1)return false;
        }
        //left down
        for(int c = col - 1, r = row + 1 ; c>=0 && r<n; c--, r++){
            if(chessBoard[r][c]==1)return false;
        }
        //top
        for(int r = row-1, c = col; r>=0 && c < n; r--){
            if(chessBoard[r][c]==1)return false;
        }
        return true;
    }
}
