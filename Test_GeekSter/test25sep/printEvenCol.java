import java.util.Scanner;

public interface printEvenCol {
    public static void main(String[] args) {
        import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         int row=sc.nextInt();
        int col=sc.nextInt();
         int[][] arr=new int[row][col];
         for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                 arr[i][j]=sc.nextInt(); 
              }
          }

       for(int cols=0;cols<col;cols++){
          int count=0;
           for(int rows=0;rows<row;rows++){
               if((arr[rows][cols])%2 !=0)
                   count++;
           }
           // System.out.println(count);
           //for printing
           if(count%2==0){
           for(int rows=0;rows<row;rows++){
                
                    System.out.print(arr[rows][cols]+"\t");
                }
           System.out.println();
           }
        count=0;
          }
    }
}

// 2nd method ------------

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
         Scanner scn = new Scanner(System.in);
         int rows = scn.nextInt();
        int cols = scn.nextInt();
         int[][] arr = new int[rows][cols];
         for(int row=0;row<rows;row++){
            for(int col=0;col<cols;col++){
                 arr[row][col]=scn.nextInt(); 
              }
          }

       for(int col=0;col<cols;col++){
          int count=0;
           for(int row=0;row<rows;row++){
               if((arr[row][col])%2 !=0)
                   count++;
           }
           if(count%2==0){
           for(int row=0;row<rows;row++){
                
                    System.out.print(arr[row][col]+"\t");
                }
           System.out.println();
           }
        count=0;
          }
    }
}
