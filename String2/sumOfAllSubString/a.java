import java.util.Scanner;

// package sumOfAllSubString;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int sum = 0;
        for(int i = 0; i<str.length(); i++){
            for(int j = i+1; j<=str.length(); j++){
                int currentVal = Integer.parseInt(str.substring(i, j));
                sum = sum + currentVal;
            }
        }
        System.out.println(sum);
    }
}
