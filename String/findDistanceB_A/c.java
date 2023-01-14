import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.nextLine();
        char a = scn.nextLine().charAt(0);
        char b = scn.nextLine().charAt(0);
        int lastA = nextOccurence(str, a, -1);
        int lastB = nextOccurence(str, b, -1);
        int minDistance = Integer.MAX_VALUE;
        for(int i = 0; i<str.length(); i++){
            minDistance = Math.min(minDistance, Math.abs(lastB-lastA-1));
            if(lastA<lastB)lastA = nextOccurence(str, a, lastA);
            else lastB = nextOccurence(str, b, lastB);
        }
        System.out.println(minDistance);
    }
    public static int nextOccurence(String str, char ch, int last){
        for(int i = last+1; i<str.length(); i++){
            if(str.charAt(i)==ch)return i;
        }
        return str.length();
    }
}
