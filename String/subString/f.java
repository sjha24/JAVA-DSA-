import java.util.Scanner;

// package subString;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int start = 0; start<str.length(); start++){
            for(int end = start+1 ;end<=str.length(); end++){
                System.out.println(str.substring(start, end));
            }
        }
    }
}
