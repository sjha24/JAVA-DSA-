import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int ches[][] = new int[N][N];
        for(int row  = 0; row<N; row++){
            for(int col = 0; col<N ; col++){
                ches[row][col] = scn.nextInt();
            }
        }

        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                if(ches[row][col]==1 && isQueenSafe(ches, row, col)==false){
                    System.out.println("Danger");
                    return;
                }
            }
        }
        System.out.println("N Queens");
    }
    public static boolean isQueenSafe(int ches[][], int row, int col){
        //right
        for(int R = row, C = col+1; C<ches[0].length; C++){
            if(ches[R][C]==1)return false;
        }
        // right down
        for(int R = row+1, C = col+1; R<ches.length && C<ches[0].length; R++, C++){
            if(ches[R][C] == 1)return false;
        }
        //down
       for(int R = row+1, C = col; R<ches.length; R++){
            if(ches[R][C]==1)return false;
       }
        //dowmn left
        for(int R = row+1, C = col-1; R<ches.length && C>=0; R++, C--){
            if(ches[R][C] == 1)return false;
        }
        return true;
    }
}
