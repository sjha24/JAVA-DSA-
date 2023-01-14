import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

// package minimumDigit;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        int n = scn.nextInt();
        while(n -->0){
            int x = scn.nextInt();
            pr.add(x);
        }
        int count = 0;
        String str1 = "";
        String str2 = "";
        while(pr.size()>0){
            int digit= pr.remove();
            if(count%2==0){
                str1 += digit;
            }else{
                str2 += digit;
            }
            count++;
        }
        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);
        int ans = num1+num2;
        System.out.println(ans);
    }
}
