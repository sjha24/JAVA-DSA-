import java.util.Arrays;
import java.util.Scanner;

// package targetSum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int target = scn.nextInt();
        targetSum(arr, target);
    }

    public static void targetSum(int arr[], int target) {
        int sum = 0;
        int st = 0;
        int end = arr.length - 1;
        while (st < end) {
            if (st != 0 && arr[st] == arr[st - 1]) {
                st++;
                continue;
            }
            sum = arr[st]+arr[end];
            if(sum>target){
                end--;
            }else if(sum<target){
                st++;
            }else{
                System.out.print(arr[st]+" "+arr[end]);
                st++;
                end--;
            }
        }

    }
}
