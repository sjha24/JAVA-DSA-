// package lastOccurence;

import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int ans = 0;
        for(int last = 0; last<str.length(); last++){
            String cur = str.substring(0, last+1);
            ans = ans + StringToInteger(cur);
        }
        System.out.println(ans);
    }
    public static int StringToInteger(String str){
        int sum = 0, multi = 1, overAllSum = 0;
        for(int i = str.length()-1;i>=0; i--){
            int digit = str.charAt(i)-'0';
            sum = sum+multi * digit;
            overAllSum = overAllSum + sum;
            multi = multi * 10;
        }
        return overAllSum;
    }
}
