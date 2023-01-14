import java.util.Scanner;

public class sec {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char a = scn.nextLine().charAt(0);
        char b = scn.nextLine().charAt(0);
        int lastA = NextOccurence(str, a, -1);
        int lastB = NextOccurence(str, b, -1);
        int minDist = Integer.MAX_VALUE;
        while(lastA<str.length() && lastB<str.length()){
            minDist = Math.min(minDist,Math.abs(lastB - lastA-1));
            if(lastA<lastB)lastA = NextOccurence(str, a, lastA);
            else lastB = NextOccurence(str, b, lastB);
        }
        System.out.println(minDist);
    }
    public static int NextOccurence(String str, char ch, int last){
        for(int i = last+1; i<str.length(); i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
