import java.util.Scanner;

public class locateTheStr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String target = scn.next();
        for (int i = 0; i <= str.length() - target.length(); i++) {
            String window = str.substring(i, i + target.length());
            if (window.equals(target)) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
