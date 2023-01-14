import java.util.Scanner;

public class print_digit{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int N = 0;
        for(int i = num;i>0;i/=10){
            N = i%10;
            System.out.println(N);
        }
        
    }
}