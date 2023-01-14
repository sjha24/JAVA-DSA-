import java.util.Scanner;

public class MaxSubarray_2{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        MaxSurbarray(arr);
    }
    public static int MaxSurbarray(int[]arr){
        int MaxSubarray = Integer.MIN_VALUE;
        for(int start = 0 ; start<arr.length; start++){
            int sum = 0;
            for(int end = start; end<arr.length; end++){
                sum = sum + arr[end];
                MaxSubarray = Math.max(MaxSubarray, sum);
            }
        }
        return MaxSubarray;
    }
}