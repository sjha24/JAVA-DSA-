import java.util.Scanner;

public class findDistanceBWtwoChar {
    public static void main(String[] args) {
        Scanner scn  = new Scanner(System.in);
        String str = scn.nextLine();
        char a = scn.nextLine().charAt(0);
        char b = scn.nextLine().charAt(0);
        int lastA = nextOccurenceOfChar(str, a, -1);int lastB = nextOccurenceOfChar(str, b, -1);
        int mindDistance = Integer.MAX_VALUE;
        while(lastA<str.length() || lastB<str.length()){
            mindDistance = Math.min(mindDistance, Math.abs(lastB-lastA-1));
            if(lastA<lastB)lastA = nextOccurenceOfChar(str, a, lastA);
            else lastB = nextOccurenceOfChar(str, b, lastB);
        }
        System.out.println(mindDistance);
    }
    public static int nextOccurenceOfChar(String str,char ch, int last){
        for(int i = last+1; i<str.length(); i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
