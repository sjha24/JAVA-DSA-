// package countUniqeDigit;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        boolean arr[] = new boolean[10];
        for(int i = 0; i<str.length(); i++){
            char ch = str.charAt(i);
            arr[ch-'0']= true;
        }
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==true)count++;
        }
        System.out.println(count);
    }
}
