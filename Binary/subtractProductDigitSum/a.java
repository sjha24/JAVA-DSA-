import java.util.Scanner;

// package subtractProductDigitSum;

public class a {
    public static void main(String[] args) {
        Scanner scn =  new Scanner(System.in);
        int n = scn.nextInt();
        int p = getProduct(n);
        int s = getSum(n);
        System.out.println(p-s);
    }
    public static int getSum(int n){
        int sum = 0;
        while(n>0){
            int digit = n % 10;
            sum = sum + digit;
            n = n/10;
        }
        return sum;
    }
    public static int getProduct(int n){
        int product = 1;
        while(n>0){
            int Digit = n % 10;
            product = product * Digit;
            n = n/10;
        }
        return product;
    }
}
