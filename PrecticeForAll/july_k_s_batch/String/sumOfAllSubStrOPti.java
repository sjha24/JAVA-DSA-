import java.util.Scanner;

public class sumOfAllSubStrOPti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        StringToInteger(str);
        System.out.println(sumOfAllSubString(str));
    }
 
    public static int StringToInteger(String str){
        int power = 1,sum = 0,overAllSum = 0;
        for(int i = str.length()-1; i>=0;i--){
            int digit = str.charAt(i)-'0';
           sum = sum + digit * power;
           overAllSum = sum + overAllSum;
        //    System.out.println(sum+" "+overAllSum+" "+i+"<-i");
            power = power * 10;
        }
        // System.out.println(overAllSum+"<---overAllSum");
        return overAllSum;
    }
    public static int sumOfAllSubString(String str){
        int ans = 0;
        for(int i = 1; i<=str.length(); i++){
             ans = ans + StringToInteger(str.substring(0,i));
        }
        return ans;
    }
}
