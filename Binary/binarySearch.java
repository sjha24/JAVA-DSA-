import java.util.Scanner;

public class binarySearch{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(BinaryS(arr,target));
    }
    public static int BinaryS(int[]arr,int target){
        int left = 0, right = arr.length-1;
        while(left<=right){
            int mid = left+right/2;
            if(arr[mid]==target)return mid;
            else if(arr[mid]<target){
                left = mid+1;
            }else{
                right = mid-1;
            }
        }
        return -1;
    }
}