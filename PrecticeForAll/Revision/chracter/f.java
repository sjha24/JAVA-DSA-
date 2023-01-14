import java.util.Scanner;

// package chracter;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i = 0 ; i<str.length(); i= i+2){
            System.out.print(str.charAt(i));
        }
    }
}
