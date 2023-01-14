import java.util.Arrays;
import java.util.Scanner;

// package secondLargest;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(secondMax(arr));
    }
    public static int secondMax(int arr[]){
        Arrays.sort(arr);
        int Max = Integer.MIN_VALUE;
        int SecMax = Integer.MIN_VALUE;
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>Max){
                SecMax = Max;
                Max = arr[i];
            }else if(arr[i]>SecMax && arr[i]<Max){
                SecMax = arr[i];
            }
        }
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[right]>arr[left]){
                flag = true;
                break;
            }else{
                flag = false;
            }
            left++;
            right--;
        }
        if(flag == true)return SecMax;
        return -1;
    }
}
