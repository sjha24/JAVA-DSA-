import java.util.Scanner;
public class chr{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        //increaseing order -->
        for(char ch = 'a' ; ch<='z';ch++){
            System.out.print(ch+ " ");
        }
        System.out.println();
        //Decreasing order-->
        for(char ch = 'Z'; ch>='A';ch--){
            System.out.print(ch+ " ");
        }
        System.out.println();
        //using while loop--->
        char ch = 'Z';
        // while(ch<='z'){
        //     System.out.print(ch+ " ");
        //     ch++;
        // }
        while(ch>='A'){
            System.out.print(ch+ " ");
            ch--;
        }
    }
    

}