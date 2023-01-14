import java.util.Arrays;
import java.util.Scanner;

// package sumThree.java;

public class opti {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]= scn.nextInt();
        }
        int target = 0;
        threeSum(arr, target);
    }
    public static void threeSum(int arr[],int target){
        Arrays.sort(arr);
        for(int first = 0; first<arr.length; first++){
            if(first>0 && arr[first]==arr[first-1])continue;
            twoPointer(arr, target-arr[first], first,first+1,arr.length-1);
        }
    }
    public static void twoPointer(int arr[],int target, int first, int left , int right){
        while(left<right){
            if(left>first+1 && arr[left]==arr[left-1])left++;
            if(arr[left]+arr[right]==target){
                System.out.println(arr[first]+" "+arr[left]+" "+arr[right]);
                left++;
            }else if(arr[left]+arr[right]<target){
                left++;
            }else{
                right--;
            }
        }
    }
}
