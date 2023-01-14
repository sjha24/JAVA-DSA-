import java.util.Scanner;

public class checkArmStrong {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String res = checkArramStrong(str);
        if(str == res){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }

    }
    public static String checkArramStrong(String s){
        String res ="";
        for(int i = s.length()-1;i>=0;i--){
            res = res + s.charAt(i);
        }
        return res;
    }
}
