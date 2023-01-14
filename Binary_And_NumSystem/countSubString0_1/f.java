import java.util.Scanner;
// package countSubString0_1;


public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        int current = 0, ans = 0, previous = 0;
        for(int i = 0; i<str.length(); i++){
            if(i == 0 || str.charAt(i) != str.charAt(i-1)){
                ans = ans + Math.min(previous, current);
                previous = current;
                current = 0;
            }
            current++;
        }
        ans = ans + Math.min(previous,current);
        System.out.println(ans);
    }
}
