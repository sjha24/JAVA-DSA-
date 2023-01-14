
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

// package charFReq;

public class d {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char arr[] = new char[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next().charAt(0);
        }
        printFrequency(arr);
    }

    public static void printFrequency(char arr[]){
        TreeMap<Character, Integer>freq = new TreeMap<>();
        // HashMap<Character, Integer>freq = new HashMap<>();
        for(char ch : arr)
        freq.put(ch, freq.getOrDefault(ch, 0)+1);

        for(char ch : freq.keySet())
        System.out.println(ch+" - "+freq.get(ch));
    }
}
