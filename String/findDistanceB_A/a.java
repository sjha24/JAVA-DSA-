import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char a = scn.nextLine().charAt(0);
        char b = scn.nextLine().charAt(0);
        int lastA = NextOccurence(str, a, -1);
        int lastB = NextOccurence(str, b, -1);
        int minDistance = Integer.MAX_VALUE;
        while(lastA<str.length() && lastB<str.length()){
            minDistance = Math.min(minDistance, Math.abs(lastB-lastA-1));
            if(lastA<lastB)lastA = NextOccurence(str, a, lastA);
            else NextOccurence(str, b, lastB); 
        }
        System.out.println(minDistance);
    }
    public static int NextOccurence(String str, char ch, int last){
        for(int i = last+1; i<str.length();i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
