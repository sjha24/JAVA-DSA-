import java.util.Scanner;

// package anyBaseToDecimal;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int base = scn.nextInt();
        // System.out.println("Decimal equivalent of " + str + " in base " + base + " is " + " " + toDeci(str, base));
        System.out.println(toDeci(str, base));
    }

    public static int value(char ch) {
        if (ch >= '0' && ch <= '9')
            return (int) ch - '0';
        else
            return (int) ch - 'A' + 10;
    }

    public static int toDeci(String str, int base) {
        int length = str.length();
        int power = 1;
        int num = 0;
        int i;
        for (i = length - 1; i >= 0; i--) {
            if (value(str.charAt(i)) >= base) {
                System.out.println("Invalid Number");
                return -1;
            }

            num += value(str.charAt(i)) * power;
            power = power * base;
        }

        return num;
    }
}
