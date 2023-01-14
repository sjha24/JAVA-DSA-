import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int k = scn.nextInt();
        int mat[][] = new int[m][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < m; col++) {
                mat[row][col] = scn.nextInt();
            }
        }
        weakestRow(mat, k);
        scn.close();
    }

    public static void weakestRow(int mat[][], int k) {
            for (int col = 0; col < mat[0].length; col++) {
                for (int row = 0; row < mat.length; row++) {
                    if (col - 1 >= 0 && mat[row][col - 1] == 0)continue;
                    if (mat[row][col] == 0) {
                        System.out.print(row + " ");
                        k--;
                        if(k==0)return;

                    }
                }
            }
            for(int row = 0; row<mat.length; row++){
                if(mat[row][mat[0].length-1]==1){
                    System.out.print(row+" ");
                    k--;
                    if(k==0)return;
                }
            }
        
    }
}
