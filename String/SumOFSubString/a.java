import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int sum = 0;
        for(int st = 0; st<str.length(); st++){
            for(int last = st; last<str.length(); last++){
                int cValue = StringToInteger(str.substring(st, last+1));
                sum = sum + cValue;
            }
        }
        System.out.println(sum);
    }
    public static int StringToInteger(String s){
        int sum = 0; int multi = 1;
        for(int i = s.length()-1;i>=0;i--){
            int Digit = s.charAt(i)-'0';
            sum = sum+Digit*multi;
            multi = multi*10;
        }
        return sum;
    }
}
