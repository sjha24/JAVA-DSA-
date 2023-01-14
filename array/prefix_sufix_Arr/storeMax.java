import java.util.Scanner;

// package prefix_sufix_Arr;

public class storeMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(trapWater(arr));
    }
    public static int trapWater(int height[]){
        int n = height.length;
        int prefix[] = new int[n];
        prefix[0] = height[0];
        for(int i = 1; i<n; i++){
            prefix[i] = Math.max(height[i], prefix[i-1]);
        }
        int sufix[] = new int[n];
        sufix[n-1] = height[n-1];
        for(int i = n-2; i>=0;i--){
            sufix[i] = Math.max(height[i], sufix[i+1]);
        }
        int water = 0;
        for(int i = 0; i<height.length; i++){
            water = water + Math.min(prefix[i], sufix[i])-height[i];
            // int heightOFBulding = Math.min(prefix[i], sufix[i]);
            // water = water +( heightOFBulding-height[i]);
        }
        return water;
    }
}
