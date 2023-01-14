import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class minPssibleNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        while(n-->0){
            int val = scn.nextInt();
            pq.add(val);
        }
        StringBuilder res = new StringBuilder();
       int carry = 0;
        while(!pq.isEmpty() || carry>0){

            int d1 = (pq.size()==0) ? 0 :pq.remove();
            int d2 =  (pq.size()==0) ? 0 :pq.remove();
            res.append((d1+d2+carry)%10);
            carry = (d1+d2+carry)/10;
        }
        for(int i = res.length()-1; i>=0;i--){
            if(res.charAt(i)=='0'){
                res.deleteCharAt(i);
            }else break;
        }
        res.reverse();
        System.out.println(res);
    }
}
