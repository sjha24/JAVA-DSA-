import java.util.Scanner;

public class third {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols= scn.nextInt();
        char mat[][] = new char[rows][cols];
        for(int row = 0; row<rows;row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.next().charAt(0);
            }
        }
        String word = scn.next();
        for(int row = 0; row<rows;row++){
            for(int col = 0; col<cols; col++){
                if(iswordFound(mat,row,col,word)==true){
                    System.out.println("true");
                    return;
                }
            }
        }
        System.out.println("false");
    }
    public static boolean iswordFound(char mat[][], int row, int col, String word){
        int n = mat.length;
        //right
        int idx = 0;
        for(int r = row, c = col;c<mat[0].length && idx<word.length(); c++, idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx==word.length())return true;
        //down right
        idx = 0;
        for(int r = row, c = col;r<n && c<mat[0].length && idx<word.length(); r++,c++, idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx==word.length())return true;
        //down
        idx =0;
        for(int r = row, c = col;r<n && idx<word.length(); r++, idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx==word.length())return true;
        //down left
        idx = 0;
        for(int r = row, c = col;c>=0 && r<n && idx<word.length();r++ ,c--, idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx==word.length())return true;
        return false;
    }
}
