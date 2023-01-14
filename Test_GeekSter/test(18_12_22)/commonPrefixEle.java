import java.util.Scanner;

import org.xml.sax.SAXException;

public class commonPrefixEle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String arr[] = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.next();
        }
        System.out.println(longestCommonEle(arr));
    }

    public static String longestCommonEle(String arr[]) {
        if (arr == null || arr.length == 0)
            return "";
        if (arr.length == 1)
            return arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null || arr[i].length() == 0)
                return "";
        }

        StringBuffer sb = new StringBuffer();

        for (int i = 0; i < arr[0].length(); i++) {
            char current = arr[0].charAt(i);
            for (int j = 1; j < arr.length; j++) {
                if (arr[j].length() <= i || arr[j].charAt(i) != current)
                    return sb.toString();
            }
            sb.append(current);
        }
        return sb.toString();
    }

}
