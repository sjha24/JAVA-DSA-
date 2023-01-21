import java.util.Scanner;

public class mergeStringAlternative {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str1 = scn.nextLine();
        String str2 = scn.nextLine();
        StringBuilder res = new StringBuilder();
        int p1 = 0,p2 = 0;
        boolean done = false;
        while(p1<str1.length() && p2<str2.length()){
            if(done == false){
                char ch1 = str1.charAt(p1);
                res.append(ch1);
                p1++;
                done = true;
            }else{
                char ch2 = str2.charAt(p2);
                res.append(ch2);
                p2++;
                done = false;
            }
        }
        while(p1<str1.length()){
            char ch1 = str1.charAt(p1);
            res.append(ch1);
            p1++;
        }
        while(p2<str2.length()){
            char ch2 = str2.charAt(p2);
            res.append(ch2);
            p2++;
        }
        res.toString();
        System.out.println(res);
    }
}