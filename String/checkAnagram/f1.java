// package checkAnagram;

import java.util.Scanner;

// import javax.print.attribute.PrintServiceAttributeSet;

public class f1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(anagrams(str1,str2));
    }
    public static String anagrams(String str1,String str2){
        if(str1.length() != str2.length()){
            return "False";
        }
        int[] frq1 = new int[26];
        for(int i = 0; i<str1.length();i++){
            frq1[str1.charAt(i)-'a']++;
        }
        int[] frq2 = new int[26];
        for(int i = 0; i<str2.length(); i++){
            frq2[str2.charAt(i)-'a']++;
        }
        for(int j = 0; j<26; j++){
            if(frq1[j] != frq2[j])return "False";
        }
        return "True";
    }
}
