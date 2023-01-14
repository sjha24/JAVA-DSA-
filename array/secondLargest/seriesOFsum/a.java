import java.math.BigInteger;
import java.util.Scanner;

// package seriesOFsum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long sum = (long)n * (long)(n +1)/2;
        // int add = 0;
        // for(int i = 1; i<=n; i++){
        //     System.out.println(i+" ");
        //     add = add+i;
        // }
        // System.out.println(add+"<--loop");
        System.out.println((sum+"<-formula"));
    }
}
