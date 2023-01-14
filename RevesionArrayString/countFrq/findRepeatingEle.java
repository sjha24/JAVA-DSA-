import java.util.Arrays;
import java.util.Scanner;

public class findRepeatingEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        RepeatedEle(arr);
        // RepeatedArr(arr);
    }
    public static void RepeatedArr(int arr[]){
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-1; i++){
            if(arr[i] == arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
    public static void RepeatedEle(int arr[]){
        int duplicate[] = new int[arr.length];
        int count = 0;
        for(int i = 0;i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]==arr[j])duplicate[count++] = arr[i];
            }
        }
        for(int i = 0;i<count; i++){
            if(duplicate[i] != duplicate[i+1])
            System.out.print(duplicate[i]+" ");
        }
    }
}
