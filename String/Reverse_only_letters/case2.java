import java.util.Scanner;

// package Reverse_only_letters;

public class case2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        
        // String to StringBuilder
        StringBuilder sb = new StringBuilder(str);
        int left = 0, right = str.length() - 1;
        
        while(left < right){
            if(!Character.isLowerCase(sb.charAt(left)) 
                    && !Character.isUpperCase(sb.charAt(left))){
                left++;
            } 
            else if(!Character.isLowerCase(sb.charAt(right)) 
                    && !Character.isUpperCase(sb.charAt(right))){
                right--;
            }
            else {
                char c1 = sb.charAt(left);
                char c2 = sb.charAt(right);
                    
                sb.setCharAt(left, c2);
                sb.setCharAt(right, c1);
                
                left++; right--;
            }
        }
        
        System.out.println(sb);
    }
}
