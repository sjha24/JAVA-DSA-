import java.util.Scanner;

public class LargestRowCol{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<m; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        MaxRow_col(mat);
    }
    public static void MaxRow_col(int mat[][]){
        int max = 0;
        int idx = 0;
        boolean isRow = true;
        for(int row = 0; row<mat.length;row++){
            int sum = 0;
            for(int col = 0; col<mat[0].length; col++){
                sum = sum+ mat[row][col];
            }if(max<sum){
                max = sum;
                idx = row;
            }
        }
        for(int col = 0; col<mat[0].length; col++){
            int sum = 0;
            for(int row = 0; row<mat.length; row++){
                sum = sum + mat[row][col];
            }if(max<sum){
                max = sum;
                idx = col;
                isRow = false;
            }
        }
        if(isRow){
            System.out.println("row"+idx+" "+max);
        }else{
            System.out.println("col"+idx+" "+max);
        }
    }
}