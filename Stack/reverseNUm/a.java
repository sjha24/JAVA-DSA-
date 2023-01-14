import java.util.Scanner;
import java.util.Stack;

// package reverseNUm;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int t = scn.nextInt();
        for(int i = 0; i<t; i++){
            int num = scn.nextInt();
            System.out.println(reverseNUm(num));
        }
    }
    public static int reverseNUm(int num){
        Stack<Integer>stk = new Stack<>();
        //fill the stack;
        while(num>0){
            int digit = num % 10;
            stk.push(digit);
            num = num /10;
        }
        //clear the stack;
        int res = 0, power = 1;
        while(stk.size()>0){
            int digit = stk.pop();
            res = res + digit * power;
            power = power * 10;
        }
        return res;
    }
}
