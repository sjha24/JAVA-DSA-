// package exit_point_Mat;

import java.util.Scanner;

public class first {
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
    }
    public int[] FindExitPoint(int[][] matrix)
    {
        // code here
        int rows = matrix.length, cols = matrix[0].length;
        int x = 0, y = 0;
        char direction = 'R';
        while(x>=0 && x<rows && y>=0 && y<cols){
            if(matrix[x][y]==1){
                if(direction == 'R') direction = 'B';
                else if(direction == 'B') direction = 'L';
                else if(direction == 'L') direction = 'T';
                else direction = 'R';
                matrix[x][y] = 0;
            }
            if(direction == 'R')y++;
            else if(direction == 'L')y--;
            else if(direction == 'T')x--;
            else x++;
        }
        int result[] = {x,y};
        if(direction == 'R')result[1]--;
        else if(direction == 'T')result[0]++;
        else if(direction == 'B')result[0]--;
        else result[1]++;
        return result;
    }
}
