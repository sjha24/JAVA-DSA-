import java.util.Scanner;

public class chechNumPrime {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        if(N<=1){
            System.out.println("No");
        }
        for(int i = 2 ; i<N/2;i++){
            if(N%i==0){
                System.out.println("Yes");
                break;
            }else{
                System.out.println("No");
            }
        }
    }
}
