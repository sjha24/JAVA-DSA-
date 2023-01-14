import java.util.HashMap;
import java.util.Scanner;

public class lengthOfLongetPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int length = 0;
        HashMap<Character,Integer>freq = new HashMap<>();
        for(int i =0;i<str.length();  i++){
            char ch = str.charAt(i);
            freq.put(ch, freq.getOrDefault(ch, 0)+1);
        }
        for(char ch : freq.keySet()){
            int val = freq.get(ch);
            if(val % 2 == 1)val--;
            length += val;
        }
        if(length<str.length())length++;
        System.out.println(length);
    }
}
