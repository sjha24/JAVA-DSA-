import java.util.Scanner;

// package countWord;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' ')count++;
        }
        System.out.print(count+1);
    }
}
