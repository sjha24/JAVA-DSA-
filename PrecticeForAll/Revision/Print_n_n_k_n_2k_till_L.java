import java.util.Scanner;

public class Print_n_n_k_n_2k_till_L {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int k = scn.nextInt();
        int l = scn.nextInt();
        for(int i = N ; i>=l;i -=k){
            System.out.println(i);
        }
    }
    
}