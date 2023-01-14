import java.util.Scanner;

// package sort012;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort012(arr);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort012(int arr[]){
        int count0 =0, count1 = 0, count2 = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==0){
                count0++;
            }else if(arr[i]==1){
                count1++;
            }else{
                count2++;
            }
        }
        int i = 0;
        while(count0>0){
            arr[i] = 0;
            i++;
            count0--;
        }
        while(count1>0){
            arr[i] = 1;
            i++;
            count1--;
        }
        while(count2>0){
            arr[i] = 2;
            i++;
            count2--;
        }
    }
}
