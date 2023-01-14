import java.util.Scanner;

public class Print_Alternate_Elements_of_a_String {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int length = str.length();
        for(int i = 0 ; i<length;i+=2){
            System.out.print((str.charAt(i)));
        }
    }
}
