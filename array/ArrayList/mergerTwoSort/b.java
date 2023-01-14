import java.util.ArrayList;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr1 = new int[n];
        for (int idx = 0; idx < n; idx++) {
            arr1[idx] = scn.nextInt();
        }
        int m = scn.nextInt();
        int[] arr2 = new int[m];
        for (int idx = 0; idx < m; idx++) {
            arr2[idx] = scn.nextInt();
        }
        ArrayList<Integer> arr = merge(arr1, arr2);
        for (int val : arr) {
            System.out.print(val + " ");
        }
    }

    public static ArrayList<Integer> merge(int[] arr1, int[] arr2) {
        int left = 0, right = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (left < arr1.length && right < arr2.length) {
            if (arr1[left] <= arr2[right]) {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != arr1[left])
                arr.add(arr1[left]);
                left++;
            } else {
                if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[right])
                arr.add(arr2[right]);
                right++;
            }
        }
        if (left < arr1.length) {
            if (arr.size() == 0 || arr.get(arr.size() - 1) != arr1[left])
            arr.add(arr1[left]);
            left++;
        }
        if (right < arr2.length) {
            if (arr.size() == 0 || arr.get(arr.size() - 1) != arr2[right])
            arr.add(arr2[right]);
            right++;
        }
        return arr;
    }
}
