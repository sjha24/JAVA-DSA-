import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String input = scn.next();
        int base = scn.nextInt();
        System.out.println(anyBaseToDecimal(input, base));
    }
    public static int getDigit(char Digit){
        if(Digit>='0' && Digit<='9')return (Digit-'0');
        if(Digit == 'A') return 10;
        if(Digit=='B')return 11;
        if(Digit == 'C')return 12;
        if(Digit == 'D')return 13;
        if(Digit == 'E')return 14;
        return 15;
    }
    public static int anyBaseToDecimal(String input, int base){
        int decimal = 0, power = 1;
        for(int bit = input.length()-1; bit>=0; bit--){
            char Digit = input.charAt(bit);
            decimal = decimal + getDigit(Digit) * power;
            power = power * base;
        }
        return decimal;
    }
}
