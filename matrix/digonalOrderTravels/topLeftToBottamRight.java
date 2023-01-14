import java.util.Scanner;

// package digonalOrderTravels;

public class topLeftToBottamRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int mat[][] = new int[n][n];
        for(int row = 0; row<n; row++){
            for(int col = 0; col<n; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        downToTop(mat,n);
    }
    public static void downToTop(int mat[][], int n){
        for(int sum = 0 ; sum<=2*n-2; sum++){
            int row = 0,col = 0;
            if(sum<n){
                row = sum;
            }else{
                row = n -1;
                col = sum - row;
            }
            while(row>=0 && col<n){
                System.out.print(mat[row][col]+" ");
                row--;col++;
            }
            System.out.println();
        }
    }
}
