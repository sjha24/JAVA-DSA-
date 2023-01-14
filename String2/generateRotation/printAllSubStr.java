import java.util.Scanner;

// package generateRotation;

//printing subString
public class  printAllSubStr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        for(int st = 0 ; st<str.length(); st++){
            for(int end = st; end<str.length(); end++){//st+1 end<=str.length();
                System.out.println(str.substring(st, end+1)+" ");//sop(st,end);
            }
        }
    }
}
