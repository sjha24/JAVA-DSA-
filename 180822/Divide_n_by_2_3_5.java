import java.util.Scanner;

public class Divide_n_by_2_3_5 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int step = scn.nextInt();
        for(int i = 2; i<N; i = i/N ){
            if(N%i==0){
                step = step+2;
            }else if(N%)
        }
    }
}
