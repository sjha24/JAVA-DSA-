import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// package printBinary;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<String>q = new ArrayDeque<>();
        q.add("1");
        int N = scn.nextInt();
        while(N-- >0){
            String ans = q.remove();
            System.out.print(ans+" ");
            q.add(ans+"0");
            q.add(ans+"1");
        }
    }
}
