
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxTomin {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        int n = scn.nextInt();
        while(n-->0){
            int x = scn.nextInt();
            pq.add(x);
        }
        int carry = 0;
        StringBuilder sb = new StringBuilder();
        while(pq.size()>0||carry>0){
            int digit1 = (pq.size()==0)?0 : pq.remove();
            int digit2 = (pq.size()==0)?0 : pq.remove();
            sb.append((digit1+digit2+carry)%10);
            carry = (digit1+digit2+carry)/10;
        }
        for(int i = sb.length() - 1; i >= 0; i--){
            if(sb.charAt(i) == '0') sb.deleteCharAt(i);
            else break;
        }
        sb.reverse();
        System.out.println(sb);
    }
}
