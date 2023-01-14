import java.util.Scanner;

public class geek {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(solve(n));
    }
    public static int solve(int N){
        int count = 0;
        while(N>0){
            if(N % 2 == 0){
              N =  N / 2;
              count++;
            }else{
                N = (N+1)/2;
                count++;
            }
            N--;
        }
        return count;
    }
}
