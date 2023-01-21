import java.util.Scanner;

public class printAllSubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int st = 0; st<=str.length(); st++){
            for(int end = st+1; end<=str.length(); end++){
                System.out.println(str.substring(st, end));
            }
        }
    }
}
