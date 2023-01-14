import java.util.Scanner;
import java.util.TreeMap;

// package sameNoSameFrq;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        printFrequency(arr);
    }
    public static void printFrequency(int arr[]){
        TreeMap<Integer, Integer>frq = new TreeMap<>();
        for(int val : arr){
            frq.put(val, frq.getOrDefault(val,0)+1);
        }
        for(int key : frq.keySet()){
            if(frq.get(key)==Math.abs(key))
            System.out.println(key);
        }
    }
}
