import java.util.Scanner;

public class powerOfString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0, max = 0;
        for(int i = 0; i<str.length()-1; i++){
            if(i<str.length() && str.charAt(i)==str.charAt(i+1)){
                count++;
            }else count = 0;
            max = Math.max(max, count);
        }
        System.out.println(max+1);
    }
}
