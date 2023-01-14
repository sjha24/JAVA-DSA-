import java.util.Arrays;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        System.out.println(secondLargest(arr, n));
    }
    public static int secondLargest(int arr[], int n){
        for(int i = n -2 ; i>=0; i--){
            System.out.println(arr[n-1]);
            System.out.println(arr[i]);
            if(arr[i] !=arr[n-1])return arr[i];
        }
        return -1;
    }
}
