import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer>pq  = new PriorityQueue<>(Collections.reverseOrder());
        int n = scn.nextInt();
        for(int i = 0;i<n; i++){
            int x = scn.nextInt();
            pq.add(x);
        }
        while(pq.size()>1){
            int top1 = pq.remove();
            int top2 = pq.remove();
            if(top1>top2)pq.add(top1 - top2);
        }
        if(pq.size()==0)System.out.println(0);
        else System.out.println(pq.peek());
        scn.close();
    }
}
