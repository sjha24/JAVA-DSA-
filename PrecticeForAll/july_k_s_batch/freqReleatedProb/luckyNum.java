import java.util.Scanner;

public class luckyNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int freq[] = new int[10];
        for (int i = 0; i < n; i++) {
            freq[arr[i]]++;
        }
        for (int i = freq.length - 1; i > 0; i--) {
            if (arr[i] == i) {
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);

    }
}
