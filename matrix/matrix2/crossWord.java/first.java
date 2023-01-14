import java.util.Scanner;

public class first {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char[][] mat = new char[n][n];
    
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                mat[row][col] = scn.next().charAt(0);
            }
        }
    
        String word = scn.next();
    
        for(int row = 0; row < n; row++){
            for(int col = 0; col < n; col++){
                if(isWordAvilabel(mat, row, col, word) == true){
                    System.out.println(true);
                    return;
                }
            }
        }
    
        System.out.println(false);
    }
    public static boolean isWordAvilabel(char mat[][], int row, int col,String word){
        int n = mat.length;
        int idx = 0;
        //right
        for(int r = row, c = col;c<n && idx<word.length(); c++ , idx++){
            if(mat[r][c] !=word.charAt(idx)) break;
        }
        if(idx==word.length())return true;
        //right down
        idx = 0;
        for(int r = row, c = col;c<n && r<n && idx<word.length(); c++, r++ , idx++){
            if(mat[r][c] !=word.charAt(idx)) break;
        }
        if(idx==word.length())return true;
        //down
        idx = 0;
        for(int r = row, c = col; r<n && idx<word.length(); r++ , idx++){
            if(mat[r][c] !=word.charAt(idx)) break;
        }
        if(idx==word.length())return true;
        //down left
        idx = 0;
        for(int r = row, c = col;c>=0 && r<n && idx<word.length(); c--,r++ , idx++){
            if(mat[r][c] !=word.charAt(idx)) break;
        }
        if(idx==word.length())return true;
        return false;
    }
}
