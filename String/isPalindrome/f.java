import java.util.Scanner;

// package isPalindrome;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            char ch1 = str.charAt(left);
            char ch2 = str.charAt(right);
            if(ch1 != ch2){
                System.out.println("Notpalindrome");
                return;
            }
            left++;
            right--;
        }
        System.out.println("palindrome");
    }
}
