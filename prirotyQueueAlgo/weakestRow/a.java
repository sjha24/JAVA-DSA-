import java.util.Scanner;

// package weakestRow;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int m = scn.nextInt();
        int n = scn.nextInt();
        int k = scn.nextInt();
        int mat[][] = new int[m][n];
        for(int i = 0; i<n; i++){
            for(int j = 0; j<m; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        findweakestRow(mat, k);
    }
    public static void findweakestRow(int mat[][], int k){
        for(int col = 0; col<mat[0].length; col++){
            for(int row = 0; row<mat.length; row++){
                if(col-1>=0 && mat[row][col-1]==0)continue;
                if(mat[row][col]==0){
                    System.out.print(row+" ");
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