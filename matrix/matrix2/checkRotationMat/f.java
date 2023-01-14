import java.util.Scanner;

// import javax.xml.transform.Templates;

public class f{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int mat[][] = new int[N][N];
        for(int row = 0 ; row<N; row++){
            for(int col = 0; col<N; col++){
                mat[row][col]= scn.nextInt();
            }
        }
        for(int row = 1; row<N; row++){
            boolean same = false;
            for(int j = 0; j<=N; j++){
                rotateMat(mat, row);
                if(checkRotationMat(mat, 0, row)==true){
                    same = true;
                    break;
                }
            }
            if(same==false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
    public static boolean checkRotationMat(int mat[][], int row1, int row2){
        for(int col = 0; col<mat[0].length; col++){
            if(mat[row1][col] !=mat[row2][col])return false;
        }
        return true;
    }
    public static void rotateMat(int mat[][], int row){
        int temp = mat[row][mat[0].length-1];
        for(int col = mat[0].length-1; col>0; col--){
            mat[row][col] = mat[row][col-1];
        }
        mat[row][0] = temp;
    }
}