import java.util.Scanner;

public class convert1DarrTo2Darr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int res[][] = convert1Dto2D(arr, rows, cols);
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                System.out.print(res[r][c]+" ");
            }
            System.out.println();
        }
    }
    public static int[][] convert1Dto2D(int arr[], int rows,int cols){
        int res[][] = new int[rows][cols];
        for(int i = 0 ; i<arr.length; i++){
            int row = i/cols;
            int col = i%cols;
            res[row][col] = arr[i];
        }
        return res;
    }
}
