import java.util.PriorityQueue;
import java.util.Scanner;

public class minTomax{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer>pr = new PriorityQueue<>();
        pr.add(10);
        pr.add(20);
        pr.add(30);
        pr.add(40);
        pr.add(50);
        pr.add(60);
        pr.add(70);
        pr.add(80);
        while(pr.size() > 0){
            System.out.print(pr.remove()+" ");
        }
    }
}