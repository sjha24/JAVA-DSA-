import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class breakStone {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i<n; i++){
            int x = scn.nextInt();
            pq.add(x);
        }
        while(pq.size()>1){
            int top1 = pq.remove();
            int top2 = pq.remove();
            if(top1>top2)pq.add(top1-top2);
        }
        if(pq.isEmpty())System.out.println(0);
        else System.out.println(pq.peek());
    }
}
