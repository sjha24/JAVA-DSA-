import java.util.Arrays;
import java.util.Scanner;

public class ReachTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        Arrays.sort(arr);
        Reach_target(arr,target);
    }
    public static void Reach_target(int[]arr, int target){
        int sum = 0;
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            if(end !=arr.length-1 && arr[end] == arr[end+1]){
                continue;
            }
            sum = arr[start] + arr[end];
            if(sum == target){
                System.out.println(start+" " + end);
                start++;
                end--;
            }else if(sum<target){
                start++;
            }else{
                end--;
            }
        }
    }
}
