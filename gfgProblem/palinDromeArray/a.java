
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for (int i = 0; i < t; i++) {
            int n = scn.nextInt();
            int temp = n;
            int rev = 0;
            while (temp > 0) {
                int rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            System.out.println(rev+" ");
            if (rev == n) {
                System.out.println("wins");
            } else {
                System.out.println("loses");
            }
        }
        scn.close();
    }
}