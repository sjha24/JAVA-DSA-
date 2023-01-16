import java.util.Scanner;

public class crossWord2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        char mat[][] = new char[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                mat[i][j] = scn.next().charAt(0);
            }
        }
        String word = scn.next();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                if (findCrossWord(mat, word, n, m, row, col) == true) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }

    public static boolean findCrossWord(char mat[][], String word, int n, int m, int row, int col) {
        int idx = 0;
        // left----->
        for (int c = col - 1, r = row; c >= 0 && idx < word.length(); c--, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        // left up --->
        for (int r = row - 1, c = col - 1; r >= 0 && c >= 0 && idx < word.length(); r--, c--, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        // left down--->
        for (int r = row, c = col - 1; r < m && c >= 0 && idx < word.length(); r++, c--, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;

        // right---->
        for (int r = row, c = col; c < n && idx < word.length(); c++, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        // right up --->
        for (int r = row - 1, c = col; r >= 0 && c < n && idx < word.length(); r--, c++, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        // right down-->
        for (int r = row, c = col; c < n && r < m && idx < word.length(); r++, c++, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        //vertical up ---->
        for (int r = row-1, c = col; r >= 0 && idx < word.length(); r--, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        // vertical down--->
        for (int r = row, c = col; r < m && idx < word.length(); r++, idx++) {
            if (mat[r][c] != word.charAt(idx))
                break;
        }
        if (idx == word.length())
            return true;
        else
            idx = 0;
        return false;
    }
}
