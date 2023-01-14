import java.util.Scanner;

// package findDistanceB_A;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char ch1 = scn.nextLine().charAt(0);
        char ch2 = scn.nextLine().charAt(0);
        int lastA = NextOccurence(str, ch1, -1);
        int lastB = NextOccurence(str, ch2, -1);
        int minDistance = Integer.MAX_VALUE; 
        while(lastA<str.length() && lastB<str.length()){
            minDistance = Math.min(minDistance, Math.abs(lastB-lastA-1));
            if(lastA<lastB)lastA = NextOccurence(str, ch1, lastA);
            else lastB = NextOccurence(str, ch2, lastB);
        }
        System.out.println(minDistance);
    }
    public static int NextOccurence(String str,char ch, int last){
        for(int i = last+1; i<str.length(); i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
