// package isoGram;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        int[] frq = new int[26];
        for(int i =0; i<str1.length(); i++){
            frq[str1.charAt(i)-'a']++;
        }
        for(int j = 0; j<26; j++){
            if(frq[j]>1){
                System.out.println("Not an Isogram");
                return;
            }
        }
        System.out.println("Isogram");
    }
}
