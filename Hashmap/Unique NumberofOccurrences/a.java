import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

// package Unique NumberofOccurrences;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(isUniqueNum(arr));
    }
    public static boolean isUniqueNum(int arr[]){
        HashMap<Integer, Integer>num = new HashMap<>();
        for(int val : arr){
            num.put(val,num.getOrDefault(val,0)+1);
        }
        HashSet<Integer>set = new HashSet<>(num.values());
        return num.size() == set.size();

    }
}
