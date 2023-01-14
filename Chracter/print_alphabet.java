import java.util.Scanner;
public class print_alphabet{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        char ch = scn.next().charAt(0);
         print_Alphabet(ch);
    }
    public static void print_Alphabet(char ch){
        
        for(int i = 0;i<26;i++){
            System.out.print((ch)+ " ");
            ch++;
        }
    }
}