import java.util.Scanner;

public class t {
    public static void main(String args[]) {
        int x, y;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println(findLcm(x, y));
    }

    // function that finds GCD of the number
    static int findGcd(int x, int y) {
        if (x == 0)
            // returns y is x==0
            return y;
        // calling function that returns GCD
        return findGcd(y % x, x);
    }

    // function finds the LCM
    static int findLcm(int x, int y) {
        // returns the LCM
        return (x / findGcd(x, y)) * y;
    }
}
