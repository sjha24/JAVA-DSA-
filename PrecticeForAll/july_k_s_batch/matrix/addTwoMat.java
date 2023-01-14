import java.util.Scanner;

public class addTwoMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows1 = scn.nextInt();
        int cols1 = scn.nextInt();
        int mat1[][] = new int[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                mat1[i][j] = scn.nextInt();
            }
        }
        int rows2 = scn.nextInt();
        int cols2 = scn.nextInt();
        int mat2[][] = new int[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                mat2[i][j] = scn.nextInt();
            }
        }
        addTwoMatrix(mat1, mat2);
    }

    public static void addTwoMatrix(int mat1[][], int mat2[][]) {
        if (mat1.length != mat2.length || mat1[0].length != mat2[0].length){
            System.out.println(-1);
            return;
        }
        int ans[][] = new int[mat1.length][mat1[0].length];
        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[0].length; j++) {
                ans[i][j] = mat1[i][j]+mat2[i][j];
            }
        }
        for(int i  = 0; i<ans.length; i++){
            for(int j = 0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}