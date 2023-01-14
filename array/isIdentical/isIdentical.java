import java.util.Scanner;

public class isIdentical {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size1 = scn.nextInt();
        int[] arr1 = new int[size1];
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = scn.nextInt();
        }
        int size2 = scn.nextInt();
        int[] arr2 = new int[size2];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = scn.nextInt();
        }
        boolean ans = isIdentical(arr1, arr2);
        System.out.print(ans);
    }

    public static boolean isIdentical(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}
