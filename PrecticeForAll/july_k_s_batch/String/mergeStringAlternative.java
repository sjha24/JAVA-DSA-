import java.util.Scanner;

public class mergeStringAlternative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        // apporach -1; n(time complexity)
        StringBuilder ans = new StringBuilder();
        for(int i = 0; i<str1.length(); i++){
            ans.append(str1.charAt(i));
            ans.append(str2.charAt(i));
        }
        System.out.println(ans);
        //approach - 2
        StringBuilder res = new StringBuilder();
        int p1 = 0, p2 = 0;
        boolean done = false;
        while (p1 < str1.length() && p2 < str2.length()) {
            if (done == false) {
                char ch1 = str1.charAt(p1);
                res.append(ch1);
                p1++;
                done = true;
            } else {
                char ch2 = str2.charAt(p2);
                res.append(ch2);
                p2++;
                done = false;
            }
        }
        while (p1 < str1.length()) {
            char ch1 = str1.charAt(p1);
            res.append(ch1);
            p1++;
        }
        while (p2 < str2.length()) {
            char ch2 = str2.charAt(p2);
            res.append(ch2);
            p2++;
        }
        res.toString();
        System.out.println(res);
    }

    // apporach -3 n^2
    public static void mergeStringAlter(String str1, String str2) {
        String res = "";
        for (int i = 0; i < str1.length(); i++) {
            res = res + str1.charAt(i) + str2.charAt(i);
        }
        System.out.println(res);
    }
}