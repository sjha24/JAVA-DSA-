import java.util.PriorityQueue;
import java.util.Scanner;
//heap sort---------------------->time complexity(nlogn);
public class minHeap{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        PriorityQueue<Integer>pq = new PriorityQueue<>();
        for(int i = 0; i<n; i++){
            int val = scn.nextInt();
            pq.add(val);
        }
        //print----------->
        while(pq.size()>0){
            System.out.print(pq.remove()+" ");
        }
    }
}