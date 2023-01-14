// package printOddEven_num;

import java.util.Scanner;

public class test {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int N = scn.nextInt();
        for(int i = 0 ; i<=N; i++){
            System.out.print(i+ " ");
            if(i%2==0){
                System.out.println("Even");
            }else{
                System.out.println("Odd");
            }
        }
    }
}
