import java.util.Scanner;
import java.util.Stack;

public class validparanthesesB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(validParanthes(str));
    }
    public static boolean validParanthes(String str){
        Stack<Character>stk = new Stack<>();
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch == '('){
                stk.push(ch);
            }else if(ch == ')'){
                if(stk.size()==0)return false;
                stk.pop();
            }
        }
        if(stk.size()>0){
            return false;
        }else{
            return true;
        }
    }
}
