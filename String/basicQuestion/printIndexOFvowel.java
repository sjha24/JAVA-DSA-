import java.util.Scanner;

// package basicQuestion;

public class printIndexOFvowel {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int i = 0 ; i<str.length(); i++){
            if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u')
            System.out.print(i+" ");
        }
    }
}
