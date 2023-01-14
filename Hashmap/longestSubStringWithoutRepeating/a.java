import java.util.HashMap;
import java.util.Scanner;

// package longestSubStringWithoutRepeating;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(longestSubStringWithoutRepeating(str));
    }
    public static int longestSubStringWithoutRepeating(String str){
        HashMap<Character, Integer>freq = new HashMap<>();
        int left = 0, maxLength = 0;
        for(int right = 0; right<str.length(); right++){
            char ch = str.charAt(right);
            freq.put(ch,freq.getOrDefault(ch,0)+1);
            while(freq.get(ch)>1){
                char chl = str.charAt(left);
                freq.put(chl,freq.getOrDefault(chl, 0)-1);
                left--;
            }
            maxLength = Math.max(maxLength, right-left+1);
        }
        return maxLength;
    }
}
