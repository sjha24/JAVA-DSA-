import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }

        
        System.out.print(Trap_water(arr));
        
    }
    public static int Trap_water(int[] arr){
        int N = arr.length;
        int[]prefix = new int[N];
        prefix[0] = arr[0];
        for(int i = 1; i<N; i++){
            prefix[i] = Math.max(arr[i],prefix[i-1]);
        }
        int[]suffix = new int[N];
        suffix[N-1] = arr[N-1];
        for(int i = N- 2; i>=0;i--){
            suffix[i] = Math.max(arr[i], suffix[i+1]);
        }
        int water = 0;
        for(int i = 0 ; i<N; i++){
            int heightOFWater = Math.min(prefix[i],suffix[i]);
            water = water + (heightOFWater - arr[i]);
        }
        return water;
    }
}