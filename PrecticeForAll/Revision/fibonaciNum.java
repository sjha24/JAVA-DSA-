import java.util.Scanner;

public class fibonaciNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0; i<n; i++){
            System.out.print(a+" ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}
