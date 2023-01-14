import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        print(N);
    }
    public static void print(int N){
        for(int i = 1 ; i<=N; i++){
            for(int j = 1; j<=N;j++){
                if(i==j || i+j == N+1){
                    System.out.print("X");
                }else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }
}
