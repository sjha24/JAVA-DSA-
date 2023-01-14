import java.util.Scanner;

// package octalToBinary;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int octal = scn.nextInt();
        if(octal == 0){
            System.out.println(0);
            return;
        }
        octalToDecimal(octal);
    }
    public static void decimalToBinary(int decimal){
        StringBuilder binary = new StringBuilder();
        while(decimal>0){
            binary.append(decimal % 2);
            decimal = decimal / 2;
        }
        binary = binary.reverse();
        System.out.println(binary);
    }
    public static void octalToDecimal(int octal){
        int decimal = 0, power = 1;
        while(octal>0){
            int digit = octal % 10;
            decimal = decimal + digit * power;
            power = power *8;
            octal = octal / 10;
        }
        decimalToBinary(decimal);
    }
}
