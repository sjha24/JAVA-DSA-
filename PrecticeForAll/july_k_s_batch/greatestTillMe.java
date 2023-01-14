import java.util.Scanner;

public class greatestTillMe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int premax = 0;
        for (int i = 0; i < n; i++) {
            int max = Math.max(premax, arr[i]);
            premax = max;
            System.out.println(premax);
        }
    }
}
