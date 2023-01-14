// import java.util.Scanner;
import java.util.*;

public class ty {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // for(int i = 0; i<n; i = i*2){
            // System.out.println(i+" ");//run time error;
        // }
        for(int i = 1; i<n;i *=3){
            System.out.println(i);
        }
    }
}
