import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = scn.nextInt();
            System.out.println(palinArray(a, n));
        }
    }

    public static int palinArray(int[] a, int n) {
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (check(a[i]) == 1)
                count++;
        }
        if (count == n)
            return 1;
        return 0;
    }

    public static int check(int a) {
        int m = a;
        int rev = 0;
        while (a != 0) {
            rev = (rev * 10) + (a % 10);
            a /= 10;
        }
        if (m == rev)
            return 1;
        return 0;
    }
}
