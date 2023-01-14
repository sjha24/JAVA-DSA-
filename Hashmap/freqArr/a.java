import java.util.HashMap;
import java.util.Scanner;

// package freqArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        freqArr(arr);
    }
    public static void freqArr(int arr[]){
        HashMap<Integer, Integer>num = new HashMap<>();
        for(int val : arr){
            num.put(val,num.getOrDefault(val, 0)+1);
        }
        for(int i = 0;i<arr.length; i++){
            if(i != 0 && num.get(i) != null && num.get(i)>1)
            System.out.println(i+"->"+ num.get(i));
        }
    }
}
