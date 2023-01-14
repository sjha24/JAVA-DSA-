import java.util.Scanner;

// package reachTarget2;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        reachTarget(arr, target);
    }
    public static void reachTarget(int arr[], int target){
        for(int st = 0; st<arr.length; st++){
            for(int end = st; end<arr.length; end++){
                if(arr[st]+arr[end]==target){
                    System.out.println(st+" "+end);
                    return;
                
        }
        System.out.println(-1);
        return;
    }
}
