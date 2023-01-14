package Contains_Duplicate;

import java.util.HashMap;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        HashMap<Integer, Integer>freq = new HashMap<>();
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i]  = scn.nextInt();
        }
        for(int key : arr){
            freq.put(key,freq.getOrDefault(key,0)+1);
            if(freq.get(key)>1){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
