import java.util.Scanner;

public class searchChara {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        americanKeybord(arr, n);
    }

    public static void americanKeybord(String[] arr, int n) {
        String firstRow = "qwertyuiop";
        String secondRow = "asdfghjkl";
        String thirdRow = "zxcvbnm";
        boolean flag = false;
        for (int i = 0; i < n; i++) {
            boolean ans1 = checkRow(arr[i], firstRow);
            boolean ans2 = checkRow(arr[i], secondRow);
            boolean ans3 = checkRow(arr[i], thirdRow);
            if (ans1 == true || ans2 == true || ans3 == true) {
                System.out.print(arr[i] + " ");
                flag = true;
            }
        }
        if (!flag) {
            System.out.print(-1);
        }
    }

    public static boolean checkRow(String str, String row) {
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (row.indexOf(ch) == -1) {
                return false;
            }
        }
        return true;
    }
}
