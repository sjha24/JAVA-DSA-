import java.util.Scanner;

import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;

public class Merge_Strings_Alternatively {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        String result = " ";
        for(int i = 0; i<str1.length(); i++){
            result = result + str1.charAt(i)+str2.charAt(i);
        }
        System.out.println(result);
    }
}
