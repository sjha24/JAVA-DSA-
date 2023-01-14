import java.util.Scanner;

// package countFrq;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        countFrq(arr);
    }

    public static void countFrq(int arr[]) {
        boolean travel[] = new boolean[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (travel[i] == true)
                continue;
            int count = 1;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    travel[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " " + count);
        }
    }
}
