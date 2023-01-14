import java.util.Scanner;

import javax.naming.ldap.ManageReferralControl;

// package isPersentArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        System.out.println(isPersent(arr, target));
    }

    public static String isPersent(int arr[], int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
            return "True";
        }
        return "False";
    }
}
