import java.util.Scanner;

public class countOccurence {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        //method----->1

        // String num = Integer.toString(n);
        // int count = 0;
        // for(int i = 0; i<num.length(); i++){
        //     if(num.charAt(i)-'0'==d)count++;
        // }
        // System.out.println(count);
        
        //method----------->2
        int count = 0;
        while(n>0){
            int digit = n % 10;
            if(digit==d)count++;
            n = n /10;
        }
        System.out.println(count);
    }
}
