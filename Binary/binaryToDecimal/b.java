import java.util.Scanner;

// package binaryToDecimal;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int binary = scn.nextInt();
        int power = 1, decimal = 0;
        while(binary>0){
            int digit = binary % 10;
            decimal = decimal + digit*power;
            power = power * 2;
            binary = binary / 10;
        }
        System.out.print(decimal);
    }
}
