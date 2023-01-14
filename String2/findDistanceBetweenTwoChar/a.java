import java.util.Scanner;

// package findDistanceBetweenTwoChar;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char a = scn.next().charAt(0);
        char b = scn.next().charAt(0);
        int minDistance = Integer.MAX_VALUE;
        int lastA = nextOccurence(str, a,-1);
        int lastB = nextOccurence(str, b,-1);
        while(lastA<str.length() && lastB<str.length()){
            minDistance = Math.min(minDistance, Math.abs(lastB-lastA)-1);
            if(lastA<lastB)lastA = nextOccurence(str, a, lastA);
            else lastB =  nextOccurence(str, b,lastB);
        }
        System.out.println(minDistance);
    }
    public static int nextOccurence(String str, char ch, int left){
        for(int i = left+1; i<str.length(); i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
