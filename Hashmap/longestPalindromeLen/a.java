import java.util.HashMap;
import java.util.Scanner;

// package longestPalindromeLen;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(longestPalindromeLen(str));
    }
    public static int longestPalindromeLen(String str){
        HashMap<Character, Integer>freq = new HashMap<>();
        int length =  0;
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        for(char ch : freq.keySet()){
            int val = freq.get(ch);
            if(val % 2 == 1) val--;
            length = length + val;
        }
        return length;
    }
}
