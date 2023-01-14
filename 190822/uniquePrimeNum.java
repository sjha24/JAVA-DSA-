import java.util.Scanner;

public class uniquePrimeNum{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
       int N = scn.nextInt();
       for(int i = 2; i<=N;i++){
        if(N%i == 0 && isPrime(i)==true){
            System.out.println(i);
        }
       }
    }
    public static boolean isPrime(int N){
        int sqrt = (int)Math.sqrt(N);
        for(int i = 2 ; i<=sqrt; i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}