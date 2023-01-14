import java.util.Arrays;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(threeSumClosest(arr, target));
    }
    public static int threeSumClosest(int arr[], int target){
        Arrays.sort(arr);
        int minDiff = Integer.MAX_VALUE;
        int closetSum = 0;
        for(int i = 0; i<arr.length; i++){
            int j = i+1, k = arr.length-1;
            while(j<k){
                int a = arr[i], b = arr[j], c = arr[k];
                int sum = a+b+c;
                int diffrent = Math.abs(sum - target);
                if(diffrent<minDiff){
                    minDiff = diffrent;
                    closetSum = sum;
                }
                if(sum>target){
                    k--;
                }else{
                    j++;
                }
            }
        }
        return closetSum;
    }
}