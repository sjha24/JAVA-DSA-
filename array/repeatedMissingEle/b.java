// import java.security.SecureClassLoader;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        printMissingEle(arr);
    }
    public static void printMissingEle(int arr[]){
        for(int i = 1; i<=arr.length; i++){
            boolean ans = checkMissingEle(arr, i);
            if(ans == true){
                System.out.print(i+" ");
            }
        }
    }
    public static boolean checkMissingEle(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target)return false;
        }
        return true;
    }
}
