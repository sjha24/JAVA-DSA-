import java.util.Scanner;

public class plus {
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int x = sc.nextInt();
            int y = sc.nextInt();
            int i;
            int a = (x > y) ? x : y;

            for (i = a; i <= x * y; i = i + a) {
                // returns true if both conditions are true
                if (i % x == 0 && i % y == 0)
                    break;
            }
            // prints the result
            System.out.println("LCM of " + x + " and " + y + " is: " + i);
        }
    }

}