import java.util.Scanner;

public class checkNumArmStrong {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);     
        int N = scn.nextInt();
        int ans = checkArmStrong(N);
        if(N == ans){
            System.out.println("true");
        }else{
            System.out.println("false");
        }   
       
    }
    public static int checkArmStrong(int N){
        int sum = 0 , Quib = 1;
        while(N>0){
            int Digit = N%10;
            Quib = Digit * Digit * Digit;
            sum = sum + Quib;
            N = N/10;
        }
        return sum;
    }
    
}
