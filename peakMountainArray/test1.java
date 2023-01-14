import java.util.Scanner;

public class test1{
    public static void main(String[] args) {
        Scanner scn = new  Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        peak(arr);                                                                                                                                                                                                                                                                                                               
    }
    public static void peak(int[] arr){
        for(int i = 1; i<arr.length-1;i++){
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                System.out.print(arr[i]+" ");
            }
        }
    }
}