// package swap;

import java.util.Scanner;

public class f2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int z = scn.nextInt();
        int c  = x;
        x = z;
        System.out.println(x);
       
        System.out.println(c);
        z = y;
        System.out.println(z);
    }
}
