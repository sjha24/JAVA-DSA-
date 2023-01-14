import java.util.Arrays;
import java.util.Scanner;

public class sortArrayBased_Squre {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int[] res = arraySqureSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(res[i]+" ");
        }
    }
    public static int[] arraySqureSort(int[] arr){
        int[]res = new int[arr.length];
        int left = 0, right = arr.length-1;
        int idx = arr.length-1;
        while(left<=right){
            if(arr[left]*arr[left]>=arr[right]*arr[right]){
                res[idx] = arr[left];
                left++;
                idx--;
            }else{
                res[idx] = arr[right];
                right--;
                idx--;
            }
        }
        return res;
    }
}
