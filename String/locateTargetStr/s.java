import java.util.Scanner;

// package locateTargetStr;

public class s {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String s = scn.nextLine();
        String t = scn.nextLine();
        for(int i = 0; i<s.length(); i++){
            String window = s.substring(i, i+t.length());
            if(window.equals(t)){
                System.out.println(i);
                return;
            }
        }
        System.out.println(-1);
    }
}
