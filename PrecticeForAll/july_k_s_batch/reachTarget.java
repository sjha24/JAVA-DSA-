import java.util.Arrays;
import java.util.Scanner;

public class reachTarget {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        ReachTarget(arr, k);
    }
    public static void ReachTarget(int arr[],int k){
        Arrays.sort(arr);
        int left = 0,right = arr.length-1;
        while(left<=right){
            if(left > 0 && arr[left]==arr[left-1])left++;
            else if(arr[left]+arr[right]==k){
                System.out.println(arr[left]+" "+arr[right]);
                left++;right--;
            }else if(arr[left]+arr[right]<k){
                left++;
            }else{
                right--;
            }
        }
    }
}