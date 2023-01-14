// package swap;

import java.util.Scanner;

public class f1 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int c = x;
        System.out.println("c = "+ c);
        x = y;
        System.out.println("x = "+ x);
        y = c;
        System.out.println("y = "+ y);
        y = x;
        System.out.println("x = "+ x);
        y = c;
        System.out.println("y = "+ y);
    }
}
