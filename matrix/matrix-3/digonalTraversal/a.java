import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int row = 0; row<rows; row++){
            for(int col = 0; col<cols; col++){
                mat[row][col] = scn.nextInt();
            }
        }
        int ans[] = findDigonalOrder(mat, rows, cols);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] findDigonalOrder(int mat[][], int rows, int cols){
        if(mat.length == 0)return new int[0];
        int ans[] = new int[rows * cols];
        int r = 0, c= 0;
        for(int i = 0; i<ans.length; i++){
            ans[i] = mat[r][c];
            if((r+c)%2==0){
                if(c == cols-1){
                    r++;
                }else if(r == 0){
                    c++;
                }else{
                    r--;
                    c++;
                }
            }else{
                if(r == rows -1){
                    c++;
                }else if(c==0){
                    r++;
                }else{
                    c--;
                    r++;
                }
            }
        }
        return ans;
    }
}
