import java.util.Scanner;
public class alphabets_Diagonally{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextLine();
        char ch = 'a';
        for(int row = 0; row<N;row++){
            for(int col = 0;col<N;col++){
                if(row==col){
                    System.out.print(ch);
                    ch++;
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}