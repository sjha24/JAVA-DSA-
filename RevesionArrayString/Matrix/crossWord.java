import java.util.Scanner;
public class crossWord {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char mat[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                mat[i][j] = scn.next().charAt(0);
            }
        }
        String word = scn.next();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++){
                if (findCrossWord(mat, word, n, row, col) == true){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

    public static boolean findCrossWord(char mat[][], String word, int n, int row, int col) {
        // right
        int idx = 0;
        for (int r = row, c = col; idx<word.length() && c < n; c++, idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx == word.length())return true;
        else idx = 0;
        //right down-->
        for(int r = row, c = col; c<n && r<n && idx<word.length();r++,c++,idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx == word.length())return true;
        else idx = 0;
        //left down--->
        for(int r = row,c = col-1;r<n && c>=0 && idx<word.length(); r++, c-- , idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx == word.length())return true;
        else idx = 0;
        //vertical down--->
        for(int r = row,c = col;r<n &&  idx<word.length(); r++,idx++){
            if(mat[r][c] != word.charAt(idx))break;
        }
        if(idx == word.length())return true;
        else idx = 0;
        return false;
    }
}