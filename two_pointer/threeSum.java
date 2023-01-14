import java.util.Scanner;

public class threeSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        Three_sum(arr, target);
    }

    public static void Three_sum(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (i != 0 && i < arr.length && arr[i] == arr[i - 1]) {
                continue;
            }
            twoSum(arr, target - arr[i], i + 1, arr.length - 1);

        }
    }

    public static void twoSum(int[] arr, int target, int start, int end) {
        int sum = 0;
        int F_v = arr[start - 1];
        while (start < end) {
            if (end != arr.length - 1 && arr[end] == arr[end + 1]) {
                end--;
                continue;
            }

            sum = arr[start] + arr[end];
            if (sum == target) {
                System.out.println(F_v + " " + arr[start] + " " + arr[end]);
                start++;
                end--;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }

        }
    }
}
