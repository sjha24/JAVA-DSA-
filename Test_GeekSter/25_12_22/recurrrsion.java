import java.util.Scanner;
public class recurrrsion {
    static int facto = 1;
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        recurrrsion obj = new recurrrsion();
        obj.calFactorial(n);
        System.out.println(facto);
    }
    public static void calFactorial(int n){
        if(n>=1){
            facto = facto * n;
            calFactorial(n-1);
        }
    }
}
