import java.util.Scanner;

public class MaxProductSub_Array{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(maxProduct(arr));
    }
    public static int maxProduct(int[]arr){
        int MaxSubarray = Integer.MIN_VALUE;
        for(int start = 0 ; start<arr.length; start++){
            int product = 1;
            for(int end = start; end<arr.length; end++){
                product = product * arr[end];
                MaxSubarray = Math.max(MaxSubarray, product);
            }
        }
        return MaxSubarray;
    }
}