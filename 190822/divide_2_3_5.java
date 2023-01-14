import java.util.Scanner;

public class divide_2_3_5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int step = scn.nextInt();
        while(N%2==0 || N%3==0 || N%5==0){
            if(N%2==0){
                N = N/2;
                step = step+2;
            }else if(N%3==0){
                N = N/3;
                step = step+3;
            }else{
                N =  N/5;
                step = step+5;
            }
            System.out.println(N);
            System.out.println(step);
        }

    }
}
