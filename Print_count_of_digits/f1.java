import java.util.Scanner;
public class f1{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int countOfDigit = 0 ;
        for(int i = N ; i>0;i = i/10){
           countOfDigit++;
        }
        System.out.println(countOfDigit);
        for(int i = N ;i>0;i = i/10 ){
            System.out.println(i%10);
        }
    }
}