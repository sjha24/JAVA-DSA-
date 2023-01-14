import java.util.Scanner;
import java.util.Stack;

public class postfixExp {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer> stk = new Stack<>();
        String str = scn.next();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch >= '0' && ch <= '9') {
                stk.push(ch - '0');
            } else {
                int pop1 = stk.pop();
                int pop2 = stk.pop();

                if (ch == '+') {
                    stk.push(pop2 + pop1);
                } else if (ch == '-') {
                    stk.push(pop2 - pop1);
                } else if (ch == '/') {
                    stk.push(pop2 / pop1);
                } else {
                    stk.push(pop2 * pop1);
                }
            }
        }
        System.out.println(stk.peek());
    }
}
