// package LocateTheTargetString;
import java.util.Scanner;
//sliding window
public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        String target = scn.nextLine();
        for(int i = 0 ; i<=str.length()-target.length(); i++){
            String window = str.substring(i, i+ target.length());
            if(window.equals(target)==true){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
