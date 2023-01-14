import java.util.Scanner;
public class toggle_chr{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        char ch = scn.next().charAt(0);
        if(ch>='a' && ch<='z'){
           ch = (char)(ch-32);
        }else if(ch>='A' && ch<='Z'){
            ch = (char)(ch+32);
        }
        System.out.println(ch);
    }
}