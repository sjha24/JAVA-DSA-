import java.util.Scanner;

public class reverseNum {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int Num = scn.nextInt();
        int n = 0;
        for(int i = Num;i>0;i/=10){
            n = i%10;
            System.out.print(n);
        }
    }
    
}
