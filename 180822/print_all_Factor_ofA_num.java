import java.util.Scanner;

public class print_all_Factor_ofA_num {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = 1 ; i<=N;i++){
            if(N%i==0){
                System.out.println(i);
            }
        }
    }
}
