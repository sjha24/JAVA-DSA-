import java.util.Scanner;

public class binararySearchInArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int search = scn.nextInt();
        searchValue(arr, search);
    }

    public static void searchValue(int arr[], int search) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            if (arr[left] == search) {
                System.out.println(left);
                left++;
            } else if (arr[right] == search) {
                System.out.println(right);
                right--;
            } else {
                left++;
                right--;
            }

        }
    }
}
