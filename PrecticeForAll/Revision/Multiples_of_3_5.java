import java.util.Scanner;

public class Multiples_of_3_5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = 1; i<=N ; i++){
            if(i%3==0 && i%5==0){
                System.out.println(i+ " ");
            }else if(i%3==0 || i%5==0){
                System.out.println(i+ " ");
            }
        }
    }
}
