// package SumOFSubString;
import java.util.Scanner;
public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int sum = 0;
        for(int st = 0; st<str.length(); st++){
            for(int end = st;end<str.length(); end++){
                int cValue = Integer.parseInt(str.substring(st, end+1));
                sum = sum+cValue;
            }
        }
        System.out.println(sum);
    } 
}
