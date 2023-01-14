package charFReq;
import java.util.Scanner;
import java.util.TreeMap;

public class charFreq {
    public static void printFrequency(char[] arr){
        TreeMap<Character, Integer> freq = new TreeMap<>(); // sorted keys (characters)
        
        for(char ch: arr){
            if(freq.containsKey(ch) == false){
                freq.put(ch, 1);
            } else {
                int oldFreq = freq.get(ch);
                freq.put(ch, oldFreq + 1);
            }
        }
        
        for(char ch: freq.keySet()){
            System.out.println(ch + " " + freq.get(ch));
        }
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int n = scn.nextInt();
        
        char[] arr = new char[n];
        for(int idx = 0; idx < n; idx++){
            arr[idx] = scn.next().charAt(0);
        }
        
        printFrequency(arr);
    }
}
