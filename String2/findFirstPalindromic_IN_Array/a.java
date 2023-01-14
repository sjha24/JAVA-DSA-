import java.util.Scanner;

// package findFirstPalindromic_IN_Array;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        String word[] = new String[n];
        for(int i = 0; i<n; i++){
            word[i] = scn.next();
        } 
        for(int i = 0; i<n; i++){
            if(isPalindrome(word[i])==true)System.out.println(word[i]);
            return;
        }
        System.out.println("Empty");
    }
    public static boolean isPalindrome(String str){
        int left = 0, right = str.length() -1;
        while(left<right){
            if(str.charAt(left) != str.charAt(right))return false;
            left++;right--;
        }
        return true;
    }
}
