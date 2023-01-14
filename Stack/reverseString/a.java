import java.util.Scanner;
import java.util.Stack;

// package reverseString;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        reverChar(str);
    }
    public static String reverChar(String str){
        Stack<Character>stk = new Stack<>();
        
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            stk.push(ch);
        }
        StringBuilder ans = new StringBuilder();
        while(stk.size()>0){
            char ch = stk.pop();
            ans.append(ch);
        }
        return ans.toString();
    }
}
