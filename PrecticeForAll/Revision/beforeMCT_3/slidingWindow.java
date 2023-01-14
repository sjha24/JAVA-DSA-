import java.util.ArrayList;
import java.util.Scanner;

public class slidingWindow {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        slidingWindowSet(arr, k);
    }
    public static void slidingWindowSet(int arr[] , int k){
        ArrayList<Integer>ans = new ArrayList<>();
        for(int i = 0; i<=arr.length-k; i++){
            int Currmax = Integer.MIN_VALUE;
            for(int j = i; j<i+k;j++){
                if(arr[j]>Currmax){
                    Currmax = arr[j];
                }
            }
            ans.add(Currmax);
        }
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
}
