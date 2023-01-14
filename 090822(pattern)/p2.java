import java.util.Scanner;

public class p2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rows = n;
        for(int row = 0;row<rows;row++){
            for(int col = 0; col<=row;col++){
                System.out.print(col+1+ " ");
            }
            System.out.println();
        }
    }
}
