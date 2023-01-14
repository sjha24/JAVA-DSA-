// package subseQuence_string;

import java.util.Scanner;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String target = scn.next();
        String str = scn.next();
        System.out.println(isSubseQuence(target,str));
    }
    public static boolean isSubseQuence(String target,String str){
        int p1 = 0, p2 = 0;
        while(p1<str.length() && p2<target.length()){
            if(str.charAt(p1)==target.charAt(p2)){
                p1++;p2++;
            }else{
                p1++;
            }
        }
        if(p2 == target.length())return true;
        else return false;
    }
}
