import java.util.Scanner;

public class chech_primeNO {
    public static boolean checkPrime(int Number){
        if(Number == 1 || Number == 2){
            return false;
        }
        for(int i = 2; i<=Number/2; i++){
            if(Number%2==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        boolean res = checkPrime(num);
        System.out.println(res);
    }
}
