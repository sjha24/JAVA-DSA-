import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int mat[][] = new int[n][m];
        for(int i = 0; i<mat.length; i++){
            for(int j = 0; j<mat[0].length; j++){
                mat[i][j] = scn.nextInt();
            }
        }
        int target = scn.nextInt();
        stepSearch(mat,target);
    }
    public static void stepSearch(int mat[][], int target){
        int row= 0,col = mat[0].length-1;
        while(row<mat.length && col>0){
            if(mat[row][col]==target){
                System.out.print("Yes");
                return;
            }else if(mat[row][col]>target){
                col--;
            }else{
                row++;
            }
        }
        System.out.print("NO");
    }
}
