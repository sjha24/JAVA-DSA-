import java.util.Scanner;

public class squareRoot {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        System.out.println(findSquareRoot(n));
        scn.close();
    }
    public static int findSquareRoot(int n){
        int i = 1;
        while(i * i<=n){
            i++;
        }
        return i-1;
    }
}
