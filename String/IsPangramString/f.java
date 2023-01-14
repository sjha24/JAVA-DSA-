// package IsPangramString;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        boolean frq[] = new boolean[26];
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
            if(Character.isLowerCase(ch)){
                frq[ch-'a'] = true;
            }else if(Character.isUpperCase(ch)){
                frq[ch-'A'] = true;
            }
        }
        for(int j = 0; j<26; j++){
            if(frq[j]==false){
                System.out.println("NO");
                return;
            }
        }
        System.out.println("YES");
    }
}
