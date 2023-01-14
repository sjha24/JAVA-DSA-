import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

import javax.swing.text.html.StyleSheet;

// package sameNoSameFrq;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n =  scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
       absFreq(arr);
    }
    public static void absFreq(int arr[]){
        // HashMap<Integer,Integer>freq = new HashMap<>();
        TreeMap<Integer,Integer>freq = new TreeMap<>();
        for(int val : arr){
            freq.put(val,freq.getOrDefault(val, 0)+1);
        }
        for(int key : freq.keySet()){
            if(freq.get(key)==Math.abs(key))
            System.out.println(key +" "+freq.get(key));
        }
    }
}
