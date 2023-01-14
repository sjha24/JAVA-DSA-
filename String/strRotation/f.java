import java.util.Scanner;

// package strRotation;

public class f {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        int n = str.length();
        for(int idx = n; idx>=1; idx--){
            String left = str.substring(idx, n);
            String right = str.substring(0, idx);
            System.out.print(left+right);
        }
       
    }
    
}

