// package zero_one_sort;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortZero1(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortZero1(int arr[]){
        int count = 0;
        for(int i = 0;i<arr.length; i++){
            if(arr[i]==0)count++;
        }
        for(int i = 0; i<arr.length; i++){
            if(i<count){
                arr[i] = 0;
            }else{
                arr[i] = 1;
            }
        }
    }
}
