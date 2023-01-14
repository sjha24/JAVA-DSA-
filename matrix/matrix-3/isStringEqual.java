import java.util.Scanner;

public class isStringEqual {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                System.out.println(false);
                return;
            }
        }
        System.out.println(true);
    }
}
