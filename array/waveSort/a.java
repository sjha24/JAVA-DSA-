import java.util.Arrays;
import java.util.Scanner;

// package waveSort;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int res[] = waveSort(arr);
        for(int i = 0; i<res.length; i+++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] waveSort(int arr[]){
        int left = 0;
        int right = arr.length-1;
        int res[] = new int[arr.length];
        for(int i = 0;i<arr.length; i++){
            if(i%2==0){
                res[i] = arr[right];
                right--;
            }else{
                res[i] = arr[left];
                left++;
            }
        }
        return res;
    }
}
