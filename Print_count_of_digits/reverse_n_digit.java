import java.util.Scanner;

public class reverse_n_digit {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int result = 0;
        for(int i = N ; i>0 ; i = i/10){
            int digit = i % 10;
            result = result * 10 +digit;

        }
        System.out.print(result);
    }
}
