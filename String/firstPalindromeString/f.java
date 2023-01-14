import java.util.Scanner;

// package firstPalindromeString;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        String words[] = new String[N];
        for(int i = 0; i<N; i++){
            words[i] = scn.next();
        }
        
        for(int i = 0; i<N; i++){
            if(isPalindrome(words[i])==true){
                System.out.println(words[i]);
                return;
            }
        }
        System.out.println("Empty");
    }
    public static boolean isPalindrome(String str){
        int left  = 0, right = str.length()-1;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(left) != str.charAt(right)){
                return false;
                left++;right--;
            }
        }
        return true;
    }
}
