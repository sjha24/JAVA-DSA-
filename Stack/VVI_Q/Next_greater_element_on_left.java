import java.util.ArrayList;
import java.util.Scanner;

// package VVI_Q;

public class Next_greater_element_on_left {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
         int res[] = nextGreater(arr);
        for(int i = 0;i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] nextGreater(int arr[]){
        int res[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            res[i] = -1;
            for(int j = i-1; j>=0; j--){
                if(arr[j]>arr[i]){
                    res[i] = arr[j];
                    break;
                }
            }
        }
        return res;
    }
}
