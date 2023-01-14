import java.util.Scanner;
import java.util.TreeMap;

import javax.sound.midi.Track;

// package charFReq;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char arr[] = new char[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.next().charAt(0);
        }
        printFrq(arr);
    }
    public static void printFrq(char arr[]){
        TreeMap<Character, Integer>freq = new TreeMap<>();
        for(char ch : arr){
            if(freq.containsKey(ch)==false){//freq.get(ch)==null
                freq.put(ch,1);
            }else{
                int oldFrq = freq.get(ch);
                freq.put(ch,oldFrq+1);
            }
        }
        for(char ch : freq.keySet()){
            System.out.println(ch+"-"+freq.get(ch));
        }
    }
}
