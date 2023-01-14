import java.util.Scanner;
import java.util.Stack;

public class syntax{
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        Stack<Integer>stk = new Stack<>();
        System.out.println(stk.empty());
        System.out.println(stk.size());
        stk.push(1);
        stk.push(2);
        stk.push(3);
        stk.push(4);
        stk.push(5);
        stk.push(6);
    }
}