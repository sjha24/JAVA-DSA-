
import java.util.Scanner;
public class first{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int a = 0;
        int b = 1;
        int c = 1;
        for(int i = 1 ; i<=size;i++){
            System.out.print(a+ " ");
            a = b;
            b = c;
            c = a+b;
        }
    }
}