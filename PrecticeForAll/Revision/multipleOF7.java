import java.util.Scanner;

public class multipleOF7 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = 2 ; i<=N; i+=7){
            System.out.print(i+ " ");
        }
    }
}
