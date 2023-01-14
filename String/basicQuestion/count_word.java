// package basicQuestion;

import java.util.Scanner;

public class count_word {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int count = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i) != ' ' && i == 0 || str.charAt(i-1) == ' ')count++;
        System.out.println(count);
        }
    }

}
