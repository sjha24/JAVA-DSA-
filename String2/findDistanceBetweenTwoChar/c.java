import java.util.Scanner;

// package findDistanceBetweenTwoChar;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char a = scn.next().charAt(0);
        char b = scn.next().charAt(0);
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0; i<str.length(); i++){
            for(int j = 0; j<str.length(); j++){
                if(str.charAt(i)==a && str.charAt(j)==b){
                    minDistance = Math.min(minDistance, Math.abs(i-j)-1);
                }
            }
        }
        System.out.println(minDistance);
    }
}
