import java.util.Scanner;

public class searchCharacter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        char target = scn.next().charAt(0);
        int N = scn.nextInt();
        char arr[] = new char[N];
        for (int i = 0; i < N; i++) {
            arr[i] = scn.next().charAt(0);
        }
        findChar(arr, target);
    }

    public static void findChar(char[] arr, char target) {
        int left = 0, right = arr.length - 1;
        if (target >= arr[right]) {
            System.out.println(-1);
            return;
        }
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == target) {
                System.out.println(arr[mid + 1]);
                return;
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(arr[left]);
    }
}
