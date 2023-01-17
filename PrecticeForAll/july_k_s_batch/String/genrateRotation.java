import java.util.Scanner;

public class genrateRotation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        String res = "";
            for(int end = str.length()-1; end>=0; end--){
                String left = str.substring(end+1, str.length());
                String right = str.substring(0, end+1);
                res = left+right;
                System.out.println(res);
            }   
    }
}
