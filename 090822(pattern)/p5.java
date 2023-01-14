import java.util.Scanner;

public class p5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                if (col >= n - row - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

    }

}
