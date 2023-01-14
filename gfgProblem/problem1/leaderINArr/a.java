import java.util.ArrayList;
import java.util.Scanner;

// package leaderINArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        ArrayList<Integer> ans = leaders(arr, n);
        for (int i = 0; i < ans.size(); i++) {
            System.out.print(ans.get(i) + " ");
        }
    }

    public static ArrayList<Integer> leaders(int arr[], int n) {
        ArrayList<Integer> res = new ArrayList<>();
        int max = arr.length - 1;
        for (int i = arr.length - 1; i >= 0; i--) {
            int larger = Integer.MIN_VALUE;
            if(arr[i]>larger){
                larger = arr[i];
                max = larger;
                res.add(max);
            }
        }
        return res;
    }
}
