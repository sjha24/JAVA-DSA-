import java.util.Scanner;
import java.util.Stack;

// package stack;

public class findMIni {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        Stack<Integer>stk = new Stack<>();
        for(int i =  0; i<arr.length; i++){
            while(!stk.isEmpty() && stk.peek()>arr[i])stk.pop();
            if(stk.isEmpty())stk.push(arr[i]);
            else if(stk.peek()>arr[i])stk.push(arr[i]);
        }
        System.out.println(stk.peek());
    }
}
