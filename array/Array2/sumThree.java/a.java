import java.util.Arrays;
import java.util.Scanner;

// package sum_3.java;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int target = 0;
        threeSum(arr,target);
    }
    public static void threeSum(int arr[], int target){
        Arrays.sort(arr);
        for(int first = 0;first<arr.length; first++){
            if(first>0 && arr[first-1]==arr[first])continue;
            for(int second = first+1 ; second<arr.length; second++){
                if(second>first+1 && arr[second-1]==arr[second])continue;
                for(int third = second+1 ; third<arr.length; third++){
                    if(third>second+1 && arr[third-1]==arr[third])continue;

                    if((arr[first]+arr[second]+arr[third])==target){
                        System.out.println(arr[first]+" "+arr[second]+" "+arr[third]);
                    }
                }
            }
        
        }

    }
}
