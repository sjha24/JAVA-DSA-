import java.util.Scanner;
public class sum{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int x = scn.nextInt();
        int y = scn.nextInt();
        sum(x,y);
    }
    public static void sum(int x, int y){
        int ans = x+y;
        System.out.print(ans);
    }
}