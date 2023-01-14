import java.util.Scanner;
import java.util.Stack;

public class simpleTextEditor {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        Stack<Integer>type = new Stack<>();//type of operation;
        Stack<String>undo = new Stack<>();//for store undo;
        String res = new String();
        for(int i = 0; i<test; i++){
            int choice = scn.nextInt();
            if(choice==1){
                //apend;
                String str = scn.next();
                res+=str;
                undo.push(str);
                type.push(1);
            }else if(choice == 2){
                //delete
                int n = res.length();
                int k = scn.nextInt();
                undo.push(res.substring(n-k, n));
                type.push(2);
                res = res.substring(0, n-k);
            }else if(choice == 3){
                //print
                int k = scn.nextInt();
                System.out.println(res.charAt(k-1));
            }else if (type.pop()==1){
                //undo insert delete
                String str = undo.pop();
                int n =res.length();
                int k = str.length();
                res = res.substring(0, n-k);
            }else{
                //undo delete append
                String str = undo.pop();
                res += str;
            }
        }
    }
}
