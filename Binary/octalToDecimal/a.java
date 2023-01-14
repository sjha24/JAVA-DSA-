import java.util.Scanner;

// package octalToDecimal;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int octal = scn.nextInt();
        int decimal = 0, power = 1;
        while(octal>0){
            int digit = octal % 10;
            decimal = decimal + digit * power;
            power = power * 8;
            octal = octal / 10;
        }
        System.out.println(decimal);
    }
}
