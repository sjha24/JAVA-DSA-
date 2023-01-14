import java.util.Scanner;

public class nthFiobonaci{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int Num = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 0;i<Num;i++ ){
            a = b;
            b = c;
            c= a+b;
        }
        System.out.print(a);
    }
}