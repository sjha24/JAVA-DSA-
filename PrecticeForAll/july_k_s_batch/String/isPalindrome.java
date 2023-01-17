import java.util.Scanner;

public class isPalindrome {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        if(checkPalindrome(str)==true)System.out.println("Palindrome");
        else System.out.println("Not a Palindrome");
    }
    public static boolean checkPalindrome(String str){
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!=str.charAt(right))return false;
            left++;right--;
        }
        return true;
    }
}
