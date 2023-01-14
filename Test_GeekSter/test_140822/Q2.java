import java.util.Scanner;

public class Q2 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        char ch = 'a', ch1 = 'Z';
        for(int i = 0; i<N;i++){
            System.out.println(ch1 + " " + ch);
            ch1--;
            ch++;
        }
    }
}
