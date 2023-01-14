import java.util.Scanner;
import java.util.Stack;

public class NGE_optimise {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = NGE(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] NGE(int arr[]){
        Stack<Integer>stk = new Stack<>();
        int ans[] = new int[arr.length];
        for(int i = 0 ;i<arr.length; i++){
            //smaller and equall in left element should be poped
            while(stk.size()>0 && stk.peek()<=arr[i])stk.pop();
            //filling the next greater ele element
            ans[i] = (stk.size()==0) ? -1 :stk.peek();
            //push element
            stk.push(arr[i]);
        }
        return ans;
    }
}
