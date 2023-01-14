import java.util.Scanner;
public class f{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int rows = scn.nextInt();
        int colum = scn.nextInt();
         for(int row = 1; row<=rows;row++){
            for(int col = 1;col<=colum;col++){
                if(row == 1 || row == rows || col == 1 || col == colum){
                    System.out.print("*");                
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}