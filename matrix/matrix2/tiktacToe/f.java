import java.util.Scanner;

import javax.lang.model.element.Element;

// package tiktacToe;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        char moves[][] = new char[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0;col<cols; col++){
                moves[row][col] = scn.next().charAt(0);
            }
        }
        for(int i =0; i<moves.length; i++){
            for(int j = 0; j<moves[0].length; j++)
            System.err.print(TicTacToeMoves(moves));
        }
    }
    public static boolean checkWinner(char [][]mat, char ch){
        //right digonal
        if(mat[0][0]==ch && mat[1][1] == ch && mat[2][2]==ch)return true;
        //left digonal
        if(mat[0][2]==ch && mat[1][1] == ch && mat[2][0]==ch)return true;
        //checkAllRow
        if(mat[0][0]==ch && mat[0][1] == ch && mat[0][2]==ch)return true;
        if(mat[1][0]==ch && mat[1][1] == ch && mat[1][2]==ch)return true;
        if(mat[2][0]==ch && mat[2][1] == ch && mat[2][2]==ch)return true;
        //checkAllCol
        if(mat[0][0]==ch && mat[1][0] == ch && mat[2][0]==ch)return true;
        if(mat[0][1]==ch && mat[1][1] == ch && mat[2][1]==ch)return true;
        if(mat[0][2]==ch && mat[1][2] == ch && mat[2][2]==ch)return true;
        return false;
    }
    public static String TicTacToeMoves(int moves[][]){
        char mat[][] = new char[3][3];
        char turn = 'X';
        for(int i = 0; i<moves.length; i++){
            int row = moves[i][0];
            int col = moves[i][1];
            mat[row][col] = turn;
            if(checkWinner(mat, turn)==true){
                if(turn == 'X')return "A";
                else return "B";
            }
            if(turn == 'X')turn = 'O';
            else turn = 'X';
        }
        if(moves.length == 9)return "Draw";
        else return "Pending";
    }
}
