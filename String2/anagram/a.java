import java.util.Scanner;

// package anagram;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2 = scn.next();
        System.out.println(isAnnagram(str1, str2));

    }
    public static boolean isAnnagram(String str1 , String str2){
        if(str1.length() != str2.length())return false;
        int freq1[] = new int[26];
        int freq2[] = new int[26];
        for(int i = 0; i<str1.length(); i++){
            freq1[str1.charAt(i)-'a']++;
        }
        for(int i = 0; i<str2.length(); i++){
            freq2[str2.charAt(i)-'a']++;
        }
        for(int c = 0; c<26;c++){
            if(freq1[c] != freq2[c])return false;

        }
        return true;
    }
}
