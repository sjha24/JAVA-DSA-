import java.util.Scanner;

public class storeMax {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        maxTrapingRain(arr);
    }
    public static void maxTrapingRain(int myHeight[]){
        int prefix[] = new int[myHeight.length];
        prefix[0] = myHeight[0];
        for(int i = 1; i<myHeight.length; i++){
            prefix[i] = Math.max(myHeight[i], prefix[i-1]);
        }
        int suffix[] = new int[myHeight.length];
        suffix[myHeight.length-1] = myHeight[myHeight.length-1];
        for(int i = myHeight.length-2; i>=0; i--){
            suffix[i] = Math.max(myHeight[i], suffix[i+1]);
        }
        int maxStoreWater = 0;
        for(int i = 0;i<myHeight.length; i++){
            maxStoreWater = maxStoreWater+Math.min(prefix[i],suffix[i])-myHeight[i];
        }
        System.out.println(maxStoreWater);
    }
}