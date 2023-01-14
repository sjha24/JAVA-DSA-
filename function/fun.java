import java.util.Scanner;

public class fun{
    public static int sum(int x, int y){
        int add = x + y;
        return add;
    }
    public static int sub(int x , int y){
        int sub = x -y ;
        return sub;
    }
    public static void main(String[] args) {  
        Scanner scn = new Scanner(System.in);
        int x = scn.nextInt();
        int y = scn.nextInt();
        int ans = sum(x, y);
        int ans2 = sub(x, y);
        System.out.println(ans+"<--ans of sum");
        System.out.println(ans2+"<--ans of subtract");
    }
}