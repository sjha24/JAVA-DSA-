import java.util.Scanner;

// package targetString;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String a = scn.next();
        String target = scn.next();
        for(int i = a.length(); i>=1; i--){
            String left = a.substring(i, a.length());
            String right = a.substring(0, i);
            if((left+right).equals(target)==true){
                System.out.println("true");
                return;
            }
        }
        System.out.println("false");
    }
}
