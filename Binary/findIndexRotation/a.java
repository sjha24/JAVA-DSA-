import java.util.Scanner;

// findIndexRotation;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println(findMin(arr));

    }

    public static int findMin(int[] arr) {
        if (arr[0] <= arr[arr.length - 1]) {
            return arr[0];
        }
        int left = 0;
        int right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (mid - 1 >= 0 && arr[mid] < arr[mid - 1]) {
                return arr[mid];
            } else if (arr[mid] > arr[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return arr[left];
    }
}
