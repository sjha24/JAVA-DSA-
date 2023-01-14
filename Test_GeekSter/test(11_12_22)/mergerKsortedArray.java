import java.io.*;
import java.util.*;

public class mergerKsortedArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in); 
        int rows = scn.nextInt();
        int[][] mat = new int[rows][];

        for(int row = 0; row < rows; row++){
            int cols = scn.nextInt();
            mat[row] = new int[cols];
            
            for(int col = 0; col < cols; col++)
                mat[row][col] = scn.nextInt();
        }
        
        mergeKSorted(mat);
    }
    public static void mergeKSorted(int[][] mat){
        int rows = mat.length;
        
        PriorityQueue<int[]> pq = new PriorityQueue<>((e1, e2) -> e1[2] - e2[2]);
        
        for(int row = 0; row < rows; row++){
            int[] ele = new int[3];
            ele[0] = row; ele[1] = 0; ele[2] = mat[row][0];
            pq.add(ele); // {row, col, value}
        }
        
        while(pq.size() > 0){
            int[] ele = pq.remove();
            int row = ele[0], col = ele[1], value = mat[row][col];
            System.out.print(value + " ");
            
            if(col + 1 == mat[row].length) continue;
            ele[1]++; ele[2] = mat[row][col + 1];
            pq.add(ele);
        }
    }
}