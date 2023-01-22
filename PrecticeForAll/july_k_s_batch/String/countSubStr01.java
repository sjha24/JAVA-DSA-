import java.util.Scanner;

public class countSubStr01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int preCount = 0, currCount = 0, ans = 0;
        for (int i = 0; i < str.length(); i++) {
            if (i == 0 || str.charAt(i) != str.charAt(i - 1)) {
                ans = ans + Math.min(preCount, currCount);
                preCount = currCount;
                currCount = 0;
            }
            currCount++;

        }
        ans = ans + Math.min(preCount, currCount);
        System.out.println(ans);
    }
}
