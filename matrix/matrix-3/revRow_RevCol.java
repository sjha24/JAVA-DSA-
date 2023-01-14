import java.util.Scanner;

public class revRow_RevCol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        
        for(int i = 0 ; i<n; i++){
            for(int j = 0; j<n; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        revRow(mat, n);
        revCol(mat, n);

        for(int i = 0; i<n; i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }

    }
    public static void revRow(int mat[][], int n){
        for(int row = 0; row<n; row++){
            int left = 0, right = n-1;
            while(left<right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++;right--;
            }
        }
    }
    public static void revCol(int mat[][], int n){
        for(int col = 0; col<n; col++){
            int left = 0, right = n-1;
            while(left<right){
                int temp = mat[left][col];
                mat[left][col] = mat[right][col];
                mat[right][col] = temp;
                left++;right--;
            }
        }
    }
}
