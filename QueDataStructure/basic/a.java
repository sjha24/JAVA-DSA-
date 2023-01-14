import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        // Queue<Integer>q = new ArrayDeque<>();
        // q.add(10);
        // q.add(20);
        // q.add(30);
        // q.add(40);
        // q.add(50);
        // q.add(60);
        // System.out.println(q.peek());
        Queue<String>qu = new ArrayDeque<>();
        qu.add("Saurav");
        qu.add("Pritam");
        qu.add("Neha");
        qu.add("Subham");
        qu.add("Nikki");
        System.out.println(qu.peek());
        System.out.println(qu.size());
        System.out.println(qu);
        System.out.println(qu.remove());
        System.out.println(qu);
    }
}