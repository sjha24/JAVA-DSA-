import java.util.Scanner;
import java.util.Stack;

public class online_stock_spanner {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i  = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = stockSpanner(arr);
        for(int i  = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] stockSpanner(int arr[]){
        Stack<Integer>stk = new Stack<>();
        int ans[] = new int[arr.length];

        for(int i = 0; i<arr.length; i++){
            //pop smaller and equall ele
            while(stk.size()>0 && arr[stk.peek()]<=arr[i])stk.pop();
            //forming resultant ele
            ans[i] = (stk.size()==0) ? i + 1 : i - stk.peek();
            //push current element
            stk.push(i);

        }
        return ans;
    }
}
