import java.util.Scanner;

// package prefixArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int res[] = prefixArr(arr);
        for(int i = 0; i<res.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] prefixArr(int arr[]){
        int prefixArray[] = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j = 0; j<=i; j++){
                max = Math.max(max, arr[j]);
            }
            prefixArray[i] = max;
        }
        return prefixArray;
    }
}
