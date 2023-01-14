import java.util.Scanner;

public class secondLargest {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        //input---->
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
       int ans = printSecondLargest(arr);
       System.out.println(ans);
    }
    public static int printSecondLargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>largest){
                secondLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secondLargest && arr[i]<largest){
                secondLargest = arr[i];
            }
        }
        return secondLargest;
    }
   
}
