import java.util.Arrays;
import java.util.Scanner;

public class target_sum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int target = scn.nextInt();
        TargetSum(arr, target);
    }

    public static void TargetSum(int[] arr, int target) {
        int sum = 0;
        // for(int left = 0; left<arr.length; left++){
        // for(int right = left + 1; right<arr.length; right++){
        // if(arr[left] + arr[right] == target){

        // System.out.println(arr[left] +" "+ arr[right]);
        // }
        // }
        // }

        // using two pointer---->

        int start = 0;
        int end = arr.length-1;
        while (start < end) {
            if(start !=0 && arr[start] == arr[start-1]){
                start++;
                continue;
            }

            sum = arr[start] + arr[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                start++;
            }else{
                System.out.println(arr[start]+" "+arr[end]);
                start++;
                end--;
            }

        }
       
    }
}
