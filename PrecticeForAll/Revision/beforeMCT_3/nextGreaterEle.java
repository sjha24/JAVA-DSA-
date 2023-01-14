import java.util.Scanner;
import java.util.Stack;

public class nextGreaterEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        // int ans[] = NGE(arr);//n^2
        int ans[] = nextGreaterElement(arr);
 
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] NGE(int arr[]){
        int res[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            res[i] = -1;
            for(int j = i-1; j>=0;j--){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
    public static int[] nextGreaterElement(int arr[]){
        int res[] = new int[arr.length];
        Stack<Integer>stk = new Stack<>();
        for(int i = 0; i<arr.length; i++){
            while(stk.size()> 0 && stk.peek()<=arr[i]){
                stk.pop();
            }

            if(stk.size()==0){
                res[i] = -1;
            }else{
                res[i] = stk.peek();
            }
            stk.push(arr[i]);
        }
        return res;
    }
}
