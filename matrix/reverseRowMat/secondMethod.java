// package reverseRowMat;

import java.util.Scanner;

public class secondMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        reverseRow(mat, N);
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                System.out.print(mat[row][col]+"\t");
            }
            System.out.println();
        }
    }
    public static void reverseRow(int mat[][] , int N){
        for(int row = 0; row<N; row++){
            int left = 0, right = N-1;
            while(left<right){
                int temp = mat[row][left];
                mat[row][left] = mat[row][right];
                mat[row][right] = temp;
                left++; right--;
            }
        }
    }
}
