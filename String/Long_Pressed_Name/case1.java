import java.util.Scanner;

// package Long_Pressed_Name;

public class case1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        int i1 = 0, i2 = 0;
        while(i1<str1.length() && i2<str2.length()){
            int count1 = 0;
            char ch1 = str1.charAt(i1);
            while(i1<str1.length() && str1.charAt(i1) == ch1){
                i1++;
                count1++;
            }
            int count2 = 0;
            char ch2 = str2.charAt(i2);
            while(i2<str2.length() && str2.charAt(i2) == ch2){
                i2++;
                count2++;
            }
            if(ch1 != ch2 || count1>count2){
                System.out.println(false);
                return;
            }
        }
        if(i1<str1.length() || i2<str2.length()){
            System.out.println(false);
        }else{
            System.out.println(true);
        }
    }
}
