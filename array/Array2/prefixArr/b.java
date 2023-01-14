import java.util.Scanner;

// package prefixArr;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int prefix[] = prefixArr(arr);
        for(int i =0; i<prefix.length; i++){
            System.out.print(prefix[i]+" ");
        }
    }
    public static int[] prefixArr(int arr[]){
        int prefix[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int previousMax = (i==0)?  Integer.MIN_VALUE : prefix[i-1];
            prefix[i] = Math.max(previousMax, arr[i]);
        }
        return prefix;
    }
}
