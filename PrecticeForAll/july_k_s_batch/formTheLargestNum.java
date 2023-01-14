import java.util.Scanner;

public class formTheLargestNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a[] = new int[n];
        for(int i = 0; i<n;i++){
            a[i] = scn.nextInt();
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<a.length; i++){
            String num = a.toString(a[i]);