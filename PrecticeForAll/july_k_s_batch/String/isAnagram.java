import java.util.Scanner;

public class isAnagram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        if(str1.length() != str2.length()){
            System.out.println("False");
            return;
        }
        int freq[] = new int[26];
        int freq2[] = new int[26];
        for(int i = 0; i<str1.length(); i++){
            char ch = str1.charAt(i);
            if(Character.isLowerCase(ch)){
                freq[ch-'a']++;
            }
        }
        for(int i =0; i<str2.length(); i++){
            char ch = str2.charAt(i);
            if(Character.isLowerCase(ch)){
                freq2[ch-'a']++;
                    
            }
        }
        for(int i = 0; i<26; i++){
            if(freq[i]!=freq2[i]){
               System.out.println("False");
               return;
            }
        }
        System.out.println("True");
    }
}
