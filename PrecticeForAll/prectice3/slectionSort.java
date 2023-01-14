import java.util.Scanner;

public class slectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        SlectionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void SlectionSort(int[] arr){
        for(int i = 0; i<arr.length-1; i++){
            int minimum = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[j]<arr[minimum]){
                    minimum = j;
                }
            }
            int swap = arr[i];
            arr[i] = arr[minimum];
            arr[minimum] = swap;
        }
    }
}
