import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int A = scn.nextInt();
        char ch = scn.next().charAt(0);
        int B = scn.nextInt();
        while (ch-->0) {
            switch (ch) {
                case 1:
                    if (ch == '+') {
                        int sum = A + B;
                        System.out.println(sum);
                        ch = 0;
                        break;
                    }
                case 2:
                    if (ch == '-') {
                        int subtraction = A - B;
                        System.out.println(subtraction);
                        ch = 0;
                        break;
                    }
                case 3:
                    if (ch == '*') {
                        int multiply = A * B;
                        System.out.println(multiply);
                        ch = 0;
                        break;
                    }
                case 4:
                    if (ch == '/') {
                        int divid = A / B;
                        System.out.println(divid);
                        ch = 0;
                        break;
                    }
                case 5:
                    if (ch == '%') {
                        int mod = A % B;
                        System.out.println(mod);
                        ch = 0;
                        break;
                    }
            }
        }
    }
}
