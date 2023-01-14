import java.util.Scanner;

public class addTwoMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int R1 = scn.nextInt();
        int C1 = scn.nextInt();
        int mat1[][] = new int[R1][C1];
        for(int row = 0; row < R1; row++){
            for(int col = 0; col<C1; col++){
                mat1[row][col] = scn.nextInt();
            }
        }
        int R2 = scn.nextInt();
        int C2 = scn.nextInt();
        int mat2[][] = new int[R2][C2];
        for(int row = 0; row < R2; row++){
            for(int col = 0; col<C2; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        plusTwoMat(mat1, mat2, R1, R2, C1, C2);
       
    }
    public static void plusTwoMat(int mat1[][], int mat2[][], int R1, int R2, int C1, int C2){
        if(R1 != R2 || C1 != C2){
            System.out.println("-1");
            return;
        }
        int resMat[][] = new int[R1][C1];
        for(int row = 0; row<R1; row++){
            for(int col = 0; col<C1; col++){
                resMat[row][col] = mat1[row][col]+mat2[row][col];
                System.out.print(resMat[row][col]+" ");
            }
            System.out.println();
        }
    }
}
