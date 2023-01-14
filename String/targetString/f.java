import java.util.Scanner;

// package targetString;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        for(int idx = str1.length();idx>=1; idx--){
            String left = str1.substring(idx, str1.length());
            String right = str1.substring(0, idx);
            if((left+right).equals(str2)){
                System.out.println("True");
                return;
            }
        }
        System.out.println("False");
    }  
}
