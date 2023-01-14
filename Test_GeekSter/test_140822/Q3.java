import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int x=scn.nextInt();
        int y=scn.nextInt();
        int z=scn.nextInt();
        int d=z%10*100+y%10*10+x%10;
        System.out.print(d);
    }
}
