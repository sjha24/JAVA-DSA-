import java.util.Arrays;
import java.util.Scanner;

public class first{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.print("Enter Target ----> ");
        int target = scn.nextInt();
        threeSum(arr,target);
    }
    public static void threeSum(int[] arr, int target){
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            twoSum(arr, target, i+1, arr.length-1);
        }
    }
    public static void twoSum(int[]arr, int target, int start, int end){
        int f_value = arr[start];
        int sum = 0;
        while(start<end){
            if(end !=arr.length-1 && arr[end] == arr[end+1]){
                end--;
                continue;
            }
            sum = arr[start]+arr[end];
            if(sum<target){
                start++;
            }else if(sum>target){
                end--;
            }else if(sum==target){
                System.out.println(arr[start] +" "+arr[end]);
                start++;
                end--;
            }
        }
    }
}





  