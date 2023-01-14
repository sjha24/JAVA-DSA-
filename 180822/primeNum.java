import java.util.Scanner;
public class primeNum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        for(int i = 0 ; i<size; i++){
            int N = scn.nextInt();
            boolean res = isPrime(N);
            if(res == true){
                System.out.println("prime");
            }else{
                System.out.println("not prime");
            }

        }

    }
    public static boolean isPrime(int N){
        if(N==1 || N ==2){
            return true;
        }
        for(int i = 2 ; i<=N-1;i++){
            if(N%i==0){
                return false;
            }
        }
        return true;
    }
}