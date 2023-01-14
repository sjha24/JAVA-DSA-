// package generateRotation;
import java.util.Scanner;

public class GenRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i = str.length(); i>=1; i--){
            String left = str.substring(i, str.length());
            String right = str.substring(0, i);
            System.out.println(left+right);
        }
    }
}
