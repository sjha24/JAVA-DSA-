
import java.util.Scanner;

public class countConsecutive1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int count = 0;
        int max = 0;
        for(int i = 0; i<str.length(); i++){
            if(str.charAt(i)=='1'){
                count++;
            }
            max = Math.max(max,count);
            if(str.charAt(i)!= '1') count = 0;
        }
        System.out.println(max);
    }
}