import java.util.Scanner;

// package mergeStringAlternatively;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str1.length(); i++){
            sb.append(str1.charAt(i));
            sb.append(str2.charAt(i));
        }
        System.out.println(sb);
    }
}
