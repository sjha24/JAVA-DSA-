import java.util.HashMap;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static boolean isUniqueNum(int arr[]){
        HashMap<Integer, Integer>freq = new HashMap<>();
        for(int val : arr){
            freq.put(val,freq.getOrDefault(val, 0)+1);
        }
        for(int key1 : freq.keySet()){
            int val1 = freq.get(key1);
            for(int key2 : freq.keySet()){
                int val2 = freq.get(key2);
                if(key1 != key2 && val1 == val2){
                    return true;
                }
            }
        }
        return false;
    }
}
