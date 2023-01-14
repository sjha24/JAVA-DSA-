import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public String longestCommonPrefix(String[] S) {
        if (S.length == 0)
            return "";
        String prefix = S[0];
        for (int i = 1; i < S.length; i++)
            while (S[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty())
                    return "";
            }
        return prefix;
    }

    public class main {

        public static void main(String args[]) {
            Scanner scn = new Scanner(System.in);
            Main obj = new Main();
            int n = scn.nextInt();
            String s[] = new String[n];
            for(int i = 0; i<n; i++){
                String str = scn.next();
                s[i] = str;
            }
            System.out.println(obj.longestCommonPrefix(s));
        }
    }
}
