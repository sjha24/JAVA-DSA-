import java.util.Scanner;

public class compareTwoMat {
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
        if(isSame(mat1, mat2)==true)System.out.println("Same");
        else System.out.println("Not Same");
    }
    public static boolean isSame(int mat1[][], int mat2[][]){
        if(mat1.length != mat2.length || mat1[0].length != mat2[0].length)return false;
        int rows1 = mat1.length;
        int cols1 = mat2[0].length;

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                if(mat1[i][j] != mat2[i][j])return false;
            }
        }
        return true;
    }
}
