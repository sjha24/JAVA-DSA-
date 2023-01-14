import java.util.Scanner;

public class opti {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(SumOfSubString(str));
    }
    public static int SumOfSubString(String num){
        int sum = 0;
            for(int end = 1 ; end<=num.length(); end++ ){
                String digit = num.substring(0, end);
                System.out.println(digit+"<-digit");
                sum = sum + StringToInteger(digit);
            }
        return sum;
    }
    public static int StringToInteger(String num){
        int sum = 0, multiply = 1,overAllSum = 0;
        for(int i = num.length()-1; i>=0; i--){
            int digit = num.charAt(i)-'0';
            sum = sum+digit * multiply;
            System.out.println(sum+"<--sum");
            overAllSum = overAllSum + sum;
            System.out.println(overAllSum+"<--overAllsum");
            multiply = multiply * 10;
        }
        return overAllSum;
    }
}
