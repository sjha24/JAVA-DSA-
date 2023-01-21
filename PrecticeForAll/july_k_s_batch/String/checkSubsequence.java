import java.util.Scanner;

public class checkSubsequence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String target = scn.nextLine();
        String str = scn.nextLine();
        if(isSubSequence(target, str)==true)System.out.println("True");
        else System.out.println("False");
    }
    public static boolean isSubSequence(String target, String str){
        int p1 = 0,p2 = 0;
        while(p1<target.length() && p2<str.length()){
            if(target.charAt(p1)==str.charAt(p2)){
                p1++;p2++;
            }else{
                p2++;
            }
        }
        if(p1 == target.length())return true;
        else return false;
    }
}
