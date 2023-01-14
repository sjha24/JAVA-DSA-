import java.util.Scanner;

public class test{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        char[][] wordMat = new char[N][N];

        for(int row = 0; row<N ; row++){
            for(int col = 0; col<N ;col++){
                wordMat[row][col] = scn.next().charAt(0);
            }
        }
        String word = scn.next();
        for(int row = 0 ;row<N;row++){
            for(int col = 0 ; col<N; col++){
                if(iswordPresent(wordMat, row,col,word )== true){
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
    }
    public static boolean iswordPresent(char[][] wordMat, int rows, int cols, String word){
        int n = wordMat.length;
        int i = 0;
        //horizontal right
        for(int row = rows, col = cols;col<n && i<word.length();col++,i++){
            if(wordMat[row][col] != word.charAt(i)) break;
        }
        if(i == word.length()) return true;
        //verticle down
        i = 0;
        for(int row = rows,  col = cols; row < n && i<word.length(); row++, i++){
            if(wordMat[row][col] != word.charAt(i)) break;
        }
        if(i == word.length()) return true;
        //down right
        i = 0;
        for(int row = rows, col = cols; col<n && i < word.length(); row++, col++, i++){
            if(i == word.length()) return true;
        }
        //down left
        i = 0;
        for(int row = rows, col = cols; col>=0 && row<n && i<word.length(); row++, col--, i++){
            if(i == word.length()) return true;
        }
        return false;
    }
}

