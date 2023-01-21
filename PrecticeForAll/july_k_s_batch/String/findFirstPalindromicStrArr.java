import java.util.Scanner;
public class findFirstPalindromicStrArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int length = scn.nextInt();
        String arr[] = new String[length];
        for (int i = 0; i < length; i++) {
            arr[i] = scn.next();
        }
        findFirstPalindrome(arr);
    }

    public static boolean isPalindrome(String a) {
        int left = 0;
        int right = a.length() - 1;
        while (left < right) {
            if (a.charAt(left) != a.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }

    public static void findFirstPalindrome(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if (isPalindrome(arr[i]) == true) {
                System.out.println(arr[i]);
                return;
            }

        }
        System.out.println("empty");
    }
}
