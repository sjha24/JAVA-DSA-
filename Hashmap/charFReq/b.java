import java.util.Scanner;
import java.util.TreeMap;

// package charFReq;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char arr[] = new char[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.next().charAt(0);
        }
        countFreq(arr);
    }
    public static void countFreq(char arr[]){
        TreeMap<Character, Integer>frq = new TreeMap<>();
        for(char ch : arr){
            if(frq.get(ch) == null){
                frq.put(ch, 1);
            }else{
                int oldFreq = frq.get(ch);
                frq.put(ch,oldFreq+1);
            }
        }
        for(char ch : frq.keySet()){
            System.out.println(ch + "-"+frq.get(ch));
        }
    }
}
