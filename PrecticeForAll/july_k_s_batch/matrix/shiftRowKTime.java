import java.util.Scanner;

public class shiftRowKTime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        int k = scn.nextInt();
        ShiftRow_K_Time(mat, n, k);        
        for(int i = 0; i<n;i++){
            for(int j = 0; j<n; j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void ShiftRow_K_Time(int mat[][],int n, int k){
        k = n-k;
        for(int row = 0; row<n; row++){
            reverseCol(mat, row, 0, n-k-1);
            reverseCol(mat, row, n-k, n-1);
            reverseCol(mat, row, 0, n-1);
        }
    }
    public static void reverseCol(int mat[][],int row ,int left,int right){
        while(left<right){
            int temp = mat[row][left];
            mat[row][left] = mat[row][right];
            mat[row][right] = temp;
            left++;right--;
        }
    }
}
