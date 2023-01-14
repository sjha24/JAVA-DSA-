import java.util.Scanner;
import java.util.Stack;

public class syntaxB {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Stack<Integer>stk = new Stack<>();
        int t = scn.nextInt();
        for(int i =0; i<t; i++){
            int option = scn.nextInt();
            if(option == 1){
                System.out.println(stk.size());
            }else if(option == 2){
                if(stk.empty()==false){
                    stk.pop();
                }else{
                    System.out.println(-1);
                }
            }else if(option == 3){
                int x = scn.nextInt();
                stk.push(x);
            }else if(option == 4){
                if(stk.empty()==false){
                    System.out.println(stk.peek());
                }else{
                    System.out.println(-1);
                }
            }
        }
    }
}
