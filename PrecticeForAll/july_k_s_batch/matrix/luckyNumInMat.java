import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class luckyNumInMat {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int cols = scn.nextInt();
        int mat[][] = new int[rows][cols];
        for(int r = 0; r<rows; r++){
            for(int c = 0; c<cols; c++){
                mat[r][c] = scn.nextInt();
            }
        }
        System.out.println(luckyNum(mat));
    }
    public static List<Integer> luckyNum(int mat[][]){
        ArrayList<Integer>rows = new ArrayList<>();
        ArrayList<Integer>cols = new ArrayList<>();
        for(int c =0; c<mat[0].length; c++){
            int maxCol = Integer.MIN_VALUE;
            for(int r = 0 ; r<mat.length; r++){
                maxCol = Math.max(maxCol, mat[r][c]);
            }
            cols.add(maxCol);
        }
        for(int r =0; r<mat.length; r++){
            int minRow = Integer.MIN_VALUE;
            for(int c = 0 ; c<mat[0].length; c++){
                minRow = Math.min(minRow, mat[r][c]);
            }
            rows.add(minRow);
        }
        rows.retainAll(cols);
        return rows;
    }
}
