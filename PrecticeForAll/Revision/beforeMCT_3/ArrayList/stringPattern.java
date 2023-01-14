import java.util.Scanner;

public class stringPattern {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String pattern = scn.next();
        String str = scn.next();
        int count = 0;
        for(int left = 0;left<str.length(); left++){
            for(int right = left; right<str.length(); right++){
                if(str.substring(left, right+1).equals(pattern))count++;
            }
        }
        System.out.println(count);
    }
}
