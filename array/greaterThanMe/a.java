import java.util.Scanner;

// package greaterThanMe;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        solve(arr);
    }
    public static int greaterThanMe(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>target){
                count++;
            }
        }
        return count;
    }
    public static  void solve(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int count = greaterThanMe(arr, arr[i]);
            System.out.print(count+" ");
        }
    }
}
