import java.util.Arrays;
import java.util.Scanner;

public class twoGreaterEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        long arr[] = new long[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        for(int i = 0; i<arr.length-2; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
