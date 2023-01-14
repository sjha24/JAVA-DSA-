import java.util.Scanner;
import java.util.Stack;

public class deleteConsecutive{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<String>stk = new Stack<>();
        int n = scn.nextInt();
        for(int i =0;i<n; i++){
            String str = scn.next();
            if(stk.size()==0 || str.equals(stk.peek())==false){
                stk.push(str);
            }else{
                stk.pop();
            }
        }
        System.out.println(stk.size());
    }
}