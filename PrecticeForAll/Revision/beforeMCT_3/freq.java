// import java.util.Scanner;
import java.util.*;

public class freq {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char arr[] = new char[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.next().charAt(0);
        }
        printFreqOFCHar(arr);
    }
    public static void printFreqOFCHar(char arr[]){
        HashMap<Character, Integer>map = new HashMap<>();
        for(char val : arr){
            // if(map.containsKey(val)==false){
            //     map.put(val, 1);
            // }else{
            //     int oldFreq = map.get(val);
            //     map.put(val,oldFreq+1);
            // }
            map.put(val,map.getOrDefault(val, 0)+1);
        }
        for(char ch : map.keySet()){
            System.out.println(ch + " "+map.get(ch));
        }
    } 
}