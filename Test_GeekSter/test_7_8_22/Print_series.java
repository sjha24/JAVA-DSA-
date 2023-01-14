import java.util.Scanner;

public class Print_series{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        for(int i = 1; i<=N;i++){
            System.out.println((char)(i+96)+ " "+ i +" "+((char)(i +64)));
        }
    }
}
