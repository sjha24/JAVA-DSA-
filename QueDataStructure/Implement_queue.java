import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Implement_queue {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int q[] = new int[10000];
        int front = 0, rear = 0;
        int t = scn.nextInt();
        while(t-- >0){
            String str = scn.next();
            if(str.equals("enqueue")){
                int x = scn.nextInt();
                if(rear<q.length){
                    q[rear] = x;
                    rear++;
                }
            }else if(str.equals("denqueue")){
                if(front == rear){
                    front = rear = 0;
                }else{
                    front++;
                }
            }else if(str.equals("display")){
                for(int i = front; i<rear; i++){
                    System.out.print(q[i]+" ");
                }
                System.out.println();
            }else if(str.equals("size")){
                System.out.println(rear - front);
            }
        }
    }
}
