import java.util.Scanner;

// package interChangeCol;

public class interchangeEachCol {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        InterchangeEachCoL(mat, n);

        
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                System.out.print(mat[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static void InterchangeEachCoL(int mat[][], int n){
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
