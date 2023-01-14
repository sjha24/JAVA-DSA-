import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class duplicateFreq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        printDuplicateWithFreq(arr, n);
    }
    public static void printDuplicateWithFreq(int arr[], int n){
        HashMap<Integer, Integer>hm = new HashMap<>();
        for(int val : arr){
            hm.put(val, hm.getOrDefault(val, 0)+1);
        }

       HashSet<Integer>key = new HashSet<>();
       
    }
}