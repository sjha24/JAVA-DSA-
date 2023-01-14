import java.util.HashSet;
import java.util.Scanner;

public class findPairOfTwoSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        HashSet<Integer>hs = new HashSet<>();
        for(int val : arr){
            hs.add(val);
        }
        for(int i = 0; i<hs.size(); i++){
            if(hs
        }
    }
}
