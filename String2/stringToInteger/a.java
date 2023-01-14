import java.util.Scanner;

// package stringToInteger;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String num = scn.next();
        System.out.println(StringToInteger(num));
    }
    public static int StringToInteger(String num){
        int sum = 0, multiply = 1;
        for(int i = num.length()-1; i>=0; i--){
            int digit = num.charAt(i)-'0';
            sum = sum+digit * multiply;
            multiply = multiply * 10;
        }
        return sum;
    }
}
