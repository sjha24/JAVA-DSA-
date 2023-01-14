import java.util.Scanner;

// package binaryToOctal;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String binary = scn.nextLine();
        int decimal = binaryToDecimal(binary);
        String octal =  DecimalToOctal(decimal);
        System.out.println(octal);
    }
    public static int binaryToDecimal(String binary){
        int power = 1, decimal = 0;
        for(int i = binary.length()-1 ; i>=0; i--){
            if(binary.charAt(i)=='1'){
                decimal = decimal + power; 
            }
            power = power * 2;
        }
        return decimal;
    }
    public static String DecimalToOctal(int decimal){
        if(decimal == 0)return "0";
        StringBuilder octal = new StringBuilder();
        while(decimal>0){
            octal.append(decimal%8);
            decimal = decimal/8;
        }
        return octal.reverse().toString();
    }
}
