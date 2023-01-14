import java.util.ArrayList;
import java.util.Scanner;

// pacage maxSubArrat;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer>ans = maxSubArr(arr, n);
        for(int i = 0; i<ans.size(); i++){
            System.out.print(ans.get(i)+" ");
        }
    }
    public static ArrayList<Integer> maxSubArr(int arr[], int n){
        ArrayList<Integer>res = new ArrayList<>();
        for(int i = 0; i<n; i++){
            int max = Integer.MIN_VALUE;
            for(int j = i; j<n; j++){
                for(int k = i; k<=j; k++){
                    // res.add(arr[k]);
                    if(arr[k]>max)max = arr[k];
                }
            }
            res.add(max);
        }
        return res;
    }
}
