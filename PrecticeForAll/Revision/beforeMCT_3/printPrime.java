import java.util.Scanner;

public class printPrime {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        for (int i = 2; i <= n; i++) {
            if(isPrimeNum(i)==true)
            System.out.print(i+" ");
        }
    }
    public static boolean isPrimeNum(int num){
        if(num==2)return true;
        for(int i = 2; i<=num-1; i++){
            if(num % i== 0)return false;
        }
        return true;
    }
}
