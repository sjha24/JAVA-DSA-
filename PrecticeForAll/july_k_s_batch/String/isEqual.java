import java.util.Scanner;

public class isEqual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s1 = scn.next();
        String s2 = scn.next();
        if(s1.equals(s2))System.out.println(true);
        else System.out.println(false);
    }
}
