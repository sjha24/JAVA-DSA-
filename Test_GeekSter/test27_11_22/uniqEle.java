import java.util.HashMap;
import java.util.Scanner;

public class uniqEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        printUniqNum(arr);
    }
    public static void printUniqNum(int arr[]){
        HashMap<Integer, Integer>num = new HashMap<>();
        for(int i = 0 ; i<arr.length; i++){
            num.put(arr[i], i);
        }
        for(int val : num.keySet()){
            System.out.print(val+" ");
        }
    }
}
