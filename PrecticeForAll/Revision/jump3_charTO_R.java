import java.util.Scanner;
public class jump3_charTO_R{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch>= 'a' && ch<='w'){
            char R = (char)((int)(ch+3));
            System.out.println(R);
        }else if(ch>'w' && ch<='z'){
            System.out.println("Cant jump");
        }else{
            System.out.println("Not a small case");
        }
    }
}