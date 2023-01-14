import java.util.Arrays;
import java.util.Scanner;

// package fourSum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i< arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        fourSum(arr, target);
    }
    public static void fourSum(int arr[] , int target){
        Arrays.sort(arr);
        for(int f = 0; f<arr.length; f++){
            if(f>0 && arr[f]==arr[f-1])continue;
            for(int s = f+1; s<arr.length; s++){
                if(s>f+1 && arr[s]==arr[s-1])continue;
                for(int t = s+1 ; s<arr.length; s++){
                    if(t>s+1 && arr[t]==arr[t-1])continue;
                    for(int four = t+1 ; four<arr.length; four++){
                        if(four>t+1 && arr[four]==arr[four-1])continue;
                        if(arr[f]+arr[s]+arr[t]+arr[four]==target){
                            System.out.println(arr[f]+" "+arr[s]+" "+arr[t]+" "+arr[four]);
                        }
                    }
                }
            }
        }
    }
}
