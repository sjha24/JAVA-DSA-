import java.util.Scanner;
import java.util.Stack;

public class stack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        
        Stack<Integer> s1 = new Stack<>();
        Stack<Integer> s2 = new Stack<>();
        
        int n = sc.nextInt();

        while (n-->0){
            int c = sc.nextInt();
            if (c==1){
                int x = sc.nextInt();
                s1.push(x);
                
            }
            else if (c==2){
                while (s1.empty()==false){
                    s2.push(s1.pop());
                }
                if (s2.empty()==false){
                    s2.pop();
                }
                while (s2.empty()==false){
                    s1.push(s2.pop());
                }
            }
            else{
               while (s1.empty()==false){
                    s2.push(s1.pop());
                }
                if (s2.empty()==false){
                    System.out.println(s2.peek());
                }
                while (s2.empty()==false){
                    s1.push(s2.pop());
                }
            }
        }
        
    }
}
