package countWord;
import java.util.Scanner;

// package strRotation;

public class secApporach {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch != ' ' && (str.charAt(i-1)==' ') || i == 0)
            System.out.print(count);
        }
    }
}
