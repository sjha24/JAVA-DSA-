import java.util.Scanner;

// package findElementRotated_Arr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        int minimum = findMin(arr);
        int result = binarySearch(arr,0,minimum-1,target);
        if(result != -1){
            System.out.println(result);
            return;
        }
        System.out.println(binarySearch(arr,minimum,arr.length-1,target));
    }
    public static  int findMin(int arr[]){
        if(arr[0]<=arr[arr.length-1]){
            return 0;
        }
        int left = 0,right = arr.length-1;
        while(left<=right){
            int mid = left+(right-left)/2;
            if(mid-1>=0 && arr[mid]<arr[mid-1]){
                return mid;
            }else if(arr[mid]>arr[right]){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return 0;
    }
    public static int binarySearch(int arr[], int left, int right, int target){
        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid]>target){
                right = mid-1;
            }else{
                left = mid+1;
            }
        }
        return -1;
    }
}
