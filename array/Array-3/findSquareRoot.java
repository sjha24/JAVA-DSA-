import java.util.Scanner;

public class findSquareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
       System.out.println(SquareRoot(n));
    }
    public static int SquareRoot(int n){
        int i = 1;
        while(i * i <=n){
            i++;
        }
        return i-1;
    }
}
