import java.util.Scanner;

public class TrapingWater {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(maxStoreWater(arr));
    }
    public static int maxStoreWater(int arr[]){
        int n = arr.length;
        int prefix[] = new int[n];
        prefix[0] = arr[0];
        for(int i = 1; i<n; i++){
            prefix[i] = Math.max(prefix[i-1], arr[i]);
        }
        int sufix[] = new int[n];
        sufix[n-1] = arr[n-1];
        for(int i = n-2; i>=0; i--){
            sufix[n-i] = Math.max(sufix[i+1], arr[i]);
        }
        int water = 0;
        for(int i = 0; i<n; i++){
            water = water + Math.min(prefix[i], sufix[i])-arr[i];
        }
        return water;
    }
}
