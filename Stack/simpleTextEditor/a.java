import java.util.Scanner;
import java.util.Stack;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int test = scn.nextInt();
        Stack<Integer>typeOfOperation = new Stack<>();
        Stack<String>undo_string = new Stack<>();
        String res = new String();
        for(int i = 0; i<test; i++){
            int option = scn.nextInt();
            switch(option){
                case 1 :  if(option == 1){
                    //append
                    String str = scn.next();
                    res += str;
                    typeOfOperation.push(1);
                    undo_string.push(str);
                }
                case 2 : if(option == 2){
                    int k = scn.nextInt();
                    int n = res.length();
                    typeOfOperation.push(2);
                    undo_string.push(res.substring(n-k, n));
                    res = res.substring(0, n-k);
                }
                case 3 : if(option == 3){
                    int k = scn.nextInt();
                    System.out.println(k-1);//k is one base indexing
                }
                case 4 : if(option == 4){
                    if(typeOfOperation.pop() == 1){
                        String str = undo_string.pop();
                        int n = str.length();
                        int k = str.length();
                        res = res.substring(0, n-k);
                    }else{
                        String str = undo_string.pop();
                        res += str;
                    }
                }
            }
        }
    }
}