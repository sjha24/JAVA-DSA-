import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int length = str.length();
        for(int i = length-1; i>=0; i--){
            char reverse = str.charAt(i);
            if(str == reverse){
                System.out.print("Armstrong");
            }else{
                System.out.print("Not Armstrong");
            }
            
        }
    }
}
