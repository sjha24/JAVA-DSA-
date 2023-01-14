import java.util.Scanner;

// package chracter;

public class f1 {
    public static String reverseString(String str){
        //code here
        String res ="";
        for(int i = str.length()-1; i>=0; i--){
            res = res+str.charAt(i);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String res = reverseString(str);
        System.out.println(res);
    }
}
