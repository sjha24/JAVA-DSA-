import java.util.Scanner;

public class toggleChar {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char ch = scn.next().charAt(0);
        if(ch>='a' && ch<='z'){
            System.out.println((char)((int)(ch-32)));
        }else if(ch>='A' && ch<='Z'){
            System.out.println((char)((int)(ch+32)));
        }
    }
}
