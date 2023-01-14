import java.util.ArrayList;
import java.util.Scanner;

public class freqSort{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<ArrayList<Integer>>arr = new ArrayList<>();
        while(n-->0){
            int val = scn.nextInt();
            arr.add(new ArrayList<>());
        }
    }
}