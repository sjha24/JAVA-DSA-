import java.util.Scanner;

public class colRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                mat[r][c] = scn.nextInt();
            }
        }

        for (int r = 1; r < n; r++) {
            swap(mat, n, r);
            if(istrue(mat,n, 0, r)==true){
                System.out.println(true);
                return;
            }
        }
        System.out.println(false);
    }
    public static boolean istrue(int mat[][],int n, int row1,int row2){
        for(int col = 0; col<n; col++){
            if(mat[row1][col] != mat[row2][col])return false;
        }
        return true;
    }

    public static void swap(int mat[][],int n, int row) {
        int temp = mat[row][n-1];
        for(int col = n -1; col>0;col--){
            mat[row][col] = mat[row][col-1];
        }
        mat[row][0] = temp;
    }
}
