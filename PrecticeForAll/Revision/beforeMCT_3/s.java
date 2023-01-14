import java.util.Scanner;
import java.util.Stack;

public class s {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int k = scn.nextInt();
        int n = str.length();
        Stack<String>undo = new Stack<>();
        StringBuilder res = new StringBuilder();
        undo.push(str.substring(n-k, n));
        res.append(str.substring(0, n-k));
        System.out.println(res+"<--res");
        System.out.println(undo.toString()+"<--undo");
    }
}
