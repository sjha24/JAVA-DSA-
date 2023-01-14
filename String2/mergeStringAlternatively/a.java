import java.util.Scanner;

// package mergeStringAlternatively;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String res ="";
        for(int i = 0; i<str1.length(); i++){
            res = res+ str1.charAt(i)+str2.charAt(i);
        }
        System.out.println(res);
    }
}
