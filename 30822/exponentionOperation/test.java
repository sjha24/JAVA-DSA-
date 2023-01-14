// package exponentionOperation;

import java.util.Scanner;

public class test {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int N = scn.nextInt();
        int ans = 1;
        for(int i = 0; i<=N;i++){
            ans = ans *2;
            System.out.println(ans+ " ");
        }
    }
}
