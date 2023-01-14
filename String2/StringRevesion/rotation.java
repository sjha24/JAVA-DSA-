import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        rotationOfStr(str);
    }

    public static void rotationOfStr(String str){
        StringBuilder sb = new StringBuilder();
        for(int st = str.length()-1; st>=1; st--){
            String left = str.substring(st, str.length());
            String right = str.substring(0, st);
            System.out.println(left+right);
        }
    }
}