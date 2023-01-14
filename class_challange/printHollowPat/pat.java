// package printHollowPat;

import java.util.Scanner;

public class pat {
    public static void main(String[] aegs){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        for(int i = 0 ; i<=n;i++){
            for(int j = 1 ;j<m;j++){
                if( i==0 || j==n && j ==1 || i==m){
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
        
        
    }
}
