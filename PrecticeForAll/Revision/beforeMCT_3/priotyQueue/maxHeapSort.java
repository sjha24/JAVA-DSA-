import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class maxHeapSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PriorityQueue<Integer>pq = new PriorityQueue<>(Collections.reverseOrder());
        while(n-->0){
            int val = scn.nextInt();
            pq.add(val);
        }
        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
        }
    }
}
