import java.util.Scanner;

public class elements_greater_than_previous_array{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        printCount(arr);
    }
    public static void input(int[]arr){
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static void printCount(int[] arr){
        int count = 0;
        for(int i = 0; i<=arr.length-2; i++){
            if(arr[i+1]>arr[i]){
                count++;
            }
            
        }
        System.out.println(count);
    }
}