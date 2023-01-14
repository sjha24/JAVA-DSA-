import java.util.Scanner;

import javax.lang.model.element.Element;

// package findDistanceBetweenTwoChar;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        char a = scn.next().charAt(0);
        char b = scn.next().charAt(0);
        System.out.println(findDistanceBetweenTwoChar(str, a, b));
    }
    public static int findDistanceBetweenTwoChar(String str, char a, char b){
        int LastA = nextOccurence(str, a, -1);
        int LastB = nextOccurence(str, b, -1);
        int minDistance = Integer.MAX_VALUE;
        while(LastA<str.length() && LastB<str.length()){
            minDistance = Math.min(minDistance, Math.abs(LastB-LastA)-1);
            if(LastA<LastB) LastA = nextOccurence(str, a, LastA);
            else LastB = nextOccurence(str, b, LastB);
        }
        return minDistance;
    }
    public static int nextOccurence(String str , char ch, int left){
        for(int i = left+1; i<str.length(); i++){
            if(str.charAt(i)==ch)
            return i;
        }
        return str.length();
    }
}
