import java.util.Scanner;

public class longPressedName {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        System.out.println(isLongPressed(str1, str2));
        scn.close();
    }
    public static boolean isLongPressed(String str1, String str2){
        int idx1 = 0, idx2 = 0;
        while(idx1<str1.length() && idx2<str2.length()){
            char ch1 = str1.charAt(idx1);
            char ch2 = str2.charAt(idx2);
            int count1 = 0;
            while(idx1<str1.length() && str1.charAt(idx1) == ch1){
                count1++;
                idx1++;
            }
            int count2 = 0;
            while(idx2<str2.length() && str2.charAt(idx2) == ch2){
                count2++;
                idx2++;
            }
            if(ch1 != ch2 || count1 > count2)return false;
        }
        if(idx1<str1.length() || idx2<str2.length())return false;
        else return true;
    }
}
