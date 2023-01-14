import java.util.Scanner;

public class printNdiv3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = N ; i>0 ; i = i/3){
            System.out.println(i);
        }
    }
}
