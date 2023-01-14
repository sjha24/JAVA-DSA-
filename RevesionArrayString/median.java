import java.util.Arrays;
import java.util.Scanner;

public class median {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        getMedian(arr);
    }
    public static void getMedian(int arr[]){
        Arrays.sort(arr);
        int n = arr.length;
        int idx1 = (n/2)-1;
        int idx2 = (n/2);
        // System.out.println(arr[idx1]+"<-idx1");
        // System.out.println(arr[idx2]+"<--idx2");
        if(n%2==0){
            System.out.println((double)(arr[idx1]+arr[idx2])/2);
        }else{
            System.out.println(arr[n/2]);
        }
    }
}
