import java.util.Scanner;

public class fliping_bits {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n1 = scn.nextLong();
        long num = (1L<<32)-1;
        System.out.print(n1^num);
    }

}
