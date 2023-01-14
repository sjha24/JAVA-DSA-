// package secSmallestAndLargest;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        if(arr.length <=1){
            System.out.println(-1);
            System.out.println(-1);
            return;
        }
        System.out.println(findSecSmallest(arr));
        System.out.println(findSecLargest(arr));
    }
    public static int findSecLargest(int arr[]){
        int largest = Integer.MIN_VALUE;
        int secLargest = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length ; i++){
            if(arr[i]>largest){
                secLargest = largest;
                largest = arr[i];
            }else if(arr[i]>secLargest && arr[i]<largest){
                arr[i] = secLargest;
            }
        }
        return secLargest;
    }
    public static int findSecSmallest(int arr[]){
        int smallest = Integer.MAX_VALUE;
        int secSmall = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length;i++){
            if(arr[i]<smallest){
                secSmall = smallest;
                smallest = arr[i];
            }else if(arr[i]>smallest && arr[i]<secSmall){
                secSmall = arr[i];
            }
        }
        return secSmall;
    }
}
