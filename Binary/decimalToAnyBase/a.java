import java.util.Scanner;

// package decimalToAnyBase;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int decimal = scn.nextInt();
        int base = scn.nextInt();
        // decimalToAnyBase(decimal,base);
        System.out.println(decimalToAnyBase(decimal, base));
    }
    public static char getReminder(int reminder){
        if(reminder<=9)return (char)(reminder +'0');
        if(reminder == 10)return 'A';
        if(reminder == 11)return 'B';
        if(reminder == 12)return 'C';
        if(reminder == 13)return 'D';
        if(reminder == 14)return 'E';
        return 'F';
    }
    public static String decimalToAnyBase(int decimal, int base){
        StringBuilder result = new StringBuilder();
        while(decimal>0){
            int reminder = decimal % base;
            result.append(getReminder(reminder));
            decimal = decimal /base;
        }
        return result.reverse().toString();
    }
}
