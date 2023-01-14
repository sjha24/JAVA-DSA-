import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat1[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col =0; col<cols; col++){
                mat1[row][col] = scn.nextInt();
            }
        }
        int mat2[][] = new int[rows][cols];
         for(int row = 0; row<rows; row++){
            for(int col =0; col<cols; col++){
                mat2[row][col] = scn.nextInt();
            }
        }
        addTwoMat(mat1, mat2);  
    }
    public static void addTwoMat(int mat1[][] , int mat2[][]){
        int ans[][] = new int[mat1.length][mat1[0].length];
        for(int i = 0; i<mat1.length; i++){
            for(int j = 0; j<mat1[0].length; j++){
                ans[i][j] = mat1[i][j]+mat2[i][j];
            }
        }

        for(int r =0 ; r<ans.length; r++){
            for(int c = 0; c<ans[0].length ; c++){
                System.out.print(ans[r][c]+" ");
            }
            System.out.println();
        }
    }
}