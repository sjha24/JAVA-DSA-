import java.util.HashMap;
import java.util.Scanner;

// package findUniqChar;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(firstUniqChar(str));
    }
    public static int firstUniqChar(String str){
        HashMap<Character, Integer>freq = new HashMap<>();
        for(int i = 0 ;i<str.length(); i++){
            char ch = str.charAt(i);
            freq.put(ch,freq.getOrDefault(ch, 0)+1);
        }
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(freq.get(ch)==1){
                return i;
            }
        }
        return -1;
    }
}
