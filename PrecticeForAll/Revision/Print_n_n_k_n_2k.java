import java.util.Scanner;

public class Print_n_n_k_n_2k {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int k = scn.nextInt();
        for(int i = N ; i>=0; i = i-k){
            System.out.println(i);
        }
    }
}
