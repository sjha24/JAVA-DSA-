import java.util.Scanner;
import java.util.Stack;

public class removeAdjacentDuplicate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(removeAdjacentDuplicates(str));
    }
    public static String removeAdjacentDuplicates(String str){
        Stack<Character>stk = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(stk.size()==0 || ch != stk.peek()){
                stk.push(ch);
            }else{
                stk.pop();
            }
        }
        return stk.toString();
    }
}
