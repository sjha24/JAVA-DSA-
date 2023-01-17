import java.util.Scanner;

public class printChar{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}