import java.util.Arrays;
import java.util.Scanner;

// package fourSum;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];

        for (int idx = 0; idx < size; idx++) {
            arr[idx] = scn.nextInt();
        }

        int target = scn.nextInt();

        boolean flag = fourSum(arr, target);
        if (!flag)
        System.out.print(-1);
    }

    public static boolean fourSum(int arr[], int target) {
        Arrays.sort(arr);
        boolean flag = false;
        for (int first = 0; first < arr.length; first++) {
            if (first > 0 && arr[first - 1] == arr[first])
                continue;

            for (int second = first + 1; second < arr.length; second++) {
                if (second > first + 1 && arr[second - 1] == arr[second])
                    continue;

                for (int third = second + 1; third < arr.length; third++) {
                    if (third > second + 1 && arr[third - 1] == arr[third])
                        continue;

                    for (int four = third + 1; four < arr.length; four++) {
                        if (four > third + 1 && arr[four - 1] == arr[four])
                            continue;

                        if (arr[first] + arr[second] + arr[third] + arr[four] == target) {
                            flag = true;
                            System.out.println(arr[first] + " " + arr[second] + " " + arr[third] + " " + arr[four]);
                        }
                    }
                }
            }
        }
        return flag;
    }
}
