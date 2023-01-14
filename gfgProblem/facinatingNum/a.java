import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        long n = scn.nextLong();
        if(n<100){
            System.out.println("Not Fascinating");
            return;
        }
        int freq[] = new int[10];
        String val = "" + n + 2 * n + 3 * n;
        // System.out.println(val);
        for(int i = 0; i<val.length(); i++){
            int digit = val.charAt(i)- '0';
            if(freq[digit]>0 && digit !=0){
                System.out.println("Not Fascinating");
                return;
            }else{
                freq[digit]++;
            }
        }
        for(int i = 1 ; i<freq.length; i++){
            if(freq[i]==0){
                System.out.println("Not Fascinating");
            }else{
                System.out.println("Fascinating");
                break;
            }
        }
    }
}
