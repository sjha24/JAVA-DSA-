import java.util.HashMap;
import java.util.Scanner;

// import javax.lang.model.element.Element;

public class firstElementOccur {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        System.out.println(firstElementOccurance(arr, k));
        // firstElementOccurance(arr);
    }

    public static int firstElementOccurance(int arr[], int k) {
        HashMap<Integer, Integer> hash = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (hash.containsKey(arr[i])) {
                hash.put(arr[i], hash.get(arr[i]) + 1);
            } else {
                hash.put(arr[i], 1);
            }
            if (hash.get(arr[i]) == k) {
                return arr[i];
            }
        }

        return -1;
    }

}
