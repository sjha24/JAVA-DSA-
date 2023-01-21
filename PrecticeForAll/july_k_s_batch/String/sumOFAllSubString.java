import java.util.Scanner;

public class sumOFAllSubString {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int sum = 0;
        for(int i = 0; i<=str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                String sub = str.substring(i, j);
                sum = sum+Integer.parseInt(sub);
            }
        }
        System.out.println(sum);
    }
}