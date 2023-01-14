// package tribonaci;

import java.util.Scanner;

public class test {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        int d = 2;
        for(int i = 0 ; i<N;i++){
            a=b;
            b=c;
            c=d;
            d= a+b+c;
        }
        System.out.print(a+ " ");
    }
}
