import java.util.Scanner;

public class StringFormation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int Q = scn.nextInt();
        int t = scn.nextInt();
        StringBuffer str1 = new StringBuffer();
        str1.append(str);
        int count = 0;
        while (Q == count) {
            if (t == 1) {
                str1.reverse();
                count++;
            } else if (t == 2) {
                int f = scn.nextInt();
                count++;
                if (f == 1) {
                    str1.reverse();
                    String s = scn.next();
                    str1.append(s);
                    count++;
                } else if (f == 2) {
                    String str2 = scn.next();
                    str1.append(str2);
                    count++;
                }
            }
        }
        System.out.println(str1);
    }
}
