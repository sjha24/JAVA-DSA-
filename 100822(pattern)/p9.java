import java.util.Scanner;

public class p9 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int rows = n, colum = n;
        for(int row = 0 ; row<rows; row++){
            for(int col = 0;col<colum;col++){
                if(row%2==0 || col == 0 || col==colum-1){
                    System.out.print("*\t ");
                }else{
                    System.out.print("\t");   
                }
            }
            System.out.println();
        }

    }
}
