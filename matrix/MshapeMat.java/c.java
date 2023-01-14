import java.util.Scanner;

// package MshapeMat.java;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        boolean res = isMshape(mat,n);
        System.out.println(res);
    }
    public static boolean isMshape(int mat[][], int n){
        for(int r = 0; r<n; r++){
            for(int c = 0; c<n; c++){
                if(c == 0 || c == n-1 || (r<=n/2) && (r==c || r+c == n-1)){
                    if(mat[r][c]==0)return false;
                }else{
                    if(mat[r][c]==1)return false;
                }
            }
        }
        return true;
    }
}
