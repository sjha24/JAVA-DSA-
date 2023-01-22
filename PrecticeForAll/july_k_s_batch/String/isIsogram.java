import java.util.Scanner;

public class isIsogram {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int freq[] = new int[26];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq[ch-'a']++;
        }
        for(int i = 0; i<26; i++){
            if(freq[i]>1){
                System.out.println("Not an Isogram");
                return;
            }
        }
        System.out.println("Isogram");
    }
}
