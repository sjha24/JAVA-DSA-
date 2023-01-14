// package facinatingNum;

import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(isFacinatingNum(n)==true){
            System.out.println("Fancinating");
        }else{
            System.out.println("Not Facinating");
        }
    }
    public static boolean isFacinatingNum(long num){
        if(num<100)
        return false;
        String val = ""+ num + 2*num + 3*num;
        System.out.println(val);
        int freq[] = new int[10];
        for(int i = 0;i<val.length(); i++){
            int digit = val.charAt(i)-'0';
            if(freq[digit]>0 && digit !=0){
                return false;
            }else{
                freq[digit]++;
            }
        }
        for(int i = 1; i<freq.length; i++){
            if(freq[i]==0)
            return false;
        }
        return true;
    }
}
