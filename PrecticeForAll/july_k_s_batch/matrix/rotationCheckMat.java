import java.util.Scanner;

public class rotationCheckMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = scn.nextInt();
            }
        }
        ShiftRow_K_Time(mat, n);
    }
    public static void ShiftRow_K_Time(int mat[][], int n) {
        for (int row = 1; row < n; row++) {
            boolean same = false;
            for (int j = 0; j <= n; j++) {
                rotateMat(mat, row);
                if(checkRotateMat(mat, 0, row)==true){
                    same = true;
                    break;
                }
            }
            if(same==false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static boolean checkRotateMat(int mat[][], int row1, int row2){
        for(int col = 0; col<mat[0].length; col++){
            if(mat[row1][col] != mat[row2][col])return false;
        }
        return true;
    }

    public static void rotateMat(int mat[][], int row) {
        int temp = mat[row][mat[0].length-1];
        for(int col = mat[0].length-1; col>0; col--){
            mat[row][col] = mat[row][col-1];
        }
        mat[row][0] = temp;
    }
}
