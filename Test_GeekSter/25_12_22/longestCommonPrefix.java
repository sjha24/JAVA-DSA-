import java.util.Scanner;
//khusi Question

public class longestCommonPrefix {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String str[] = new String[n];
        for(int i = 0; i<n; i++){
            str[i] = scn.next();
        }
        System.out.println(longestCommonPrefix(str));
    }

    public static String longestCommonPrefix(String[] strs) {
        int len = strs.length;
        if (len == 0)
            return "";
        if (len == 1)
            return strs[0];

        String prefix = getPrefix(strs[0], strs[1]);

        for (int i = 2; i < len; i++) {
            prefix = getPrefix(prefix, strs[i]);
        }

        return prefix;

    }

    public static String getPrefix(String one, String two) {
        StringBuilder sb = new StringBuilder();

        int i = 0;
        int j = 0;

        while (i < one.length() && j < two.length()) {

            if (one.charAt(i) != two.charAt(i))
                break;

            sb.append(one.charAt(i));
            i++;
            j++;
        }

        return sb.toString();
    }
}
