import java.util.Scanner;

public class targetString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.next();
        String str2= scn.next();
        if(isSame(str1, str2)==true)System.out.println("True");
        else System.out.println("False");
    }
    public static boolean isSame(String str1 , String str2){
        String res = "";
        for(int i = str1.length()-1; i>=0; i--){
            String left = str1.substring(i+1,str1.length());
            String right = str1.substring(0,i+1);
            res = left+right;
            if(res.equals(str2) )return true;
        }
        return false;
    }
}
