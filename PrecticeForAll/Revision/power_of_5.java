import java.util.Scanner;

public class power_of_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Nthpower = scn.nextInt();
        int ans = 1;
        int i = 1;
        while (i<=Nthpower) {
            ans = ans*5;
            i++;
            System.out.println(ans);

        }
        System.out.println(ans);

    }
}
