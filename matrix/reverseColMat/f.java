import java.util.Scanner;

// package reverseColMat;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        reverseCol(mat, N);
        for(int row = 0; row<N; row++){
            for(int col = 0; col<N; col++){
                System.out.print(mat[row][col]+"\t");
            }
            System.out.println();
        }
    }
    public static void reverseCol(int mat[][] , int N){
        for(int col = 0; col<N; col++){
            int left = 0, right = N-1;
            while(left<right){
                int temp = mat[left][col];
                mat[left][col] = mat[right][col];
                mat[right][col] = temp;
                left++; right--;
            }
        }
    }
}
