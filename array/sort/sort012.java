package sort;
import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ;i<arr.length ; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
    }
    public static void sort(int arr[]){
        int count0 = 0, count1 = 0, count2 = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==0)count0++;
            else if(arr[i]==1)count1++;
            else count2++;
        }
        int idx = 0;
        for(int count = 0 ; count<count0; count++){
            arr[idx] = 0;
            idx++;
        }
        for(int count = 0; count<count1; count++){
            arr[idx] = 1;
            idx++;
        }
        for(int count = 0; count<count2; count++){
            arr[idx] = 2;
            idx++;
        }
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
