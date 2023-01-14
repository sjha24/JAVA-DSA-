import java.util.Scanner;

public class Print_columMat{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int M = scn.nextInt();
        int N = scn.nextInt();
        int mat[][] = new int[M][N];
        for(int row = 0 ; row<M; row++){
            for(int col = 0; col<N; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        printColMat(mat, M, N);
    }
    public static void printColMat(int mat[][], int M , int N){
        for(int row = 0 ; row<M; row++){
            for(int col = 0; col<N; col++){
                System.out.print(mat[row][col]+" ");
            }
            System.out.println();
        }
    }
}