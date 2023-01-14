import java.util.PriorityQueue;
import java.util.Scanner;

// package basic;

public class syntaxLearning {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer>pr = new PriorityQueue<>();
        int test = scn.nextInt();
        while(test-->0){
            int option = scn.nextInt();
            if(option == 1){
                System.out.println(pr.size());
            }else if(option == 2){
                if(pr.size()==0)System.out.println("-1");
                else pr.remove();
            }else if(option == 3){
                int x = scn.nextInt();
                pr.add(x);
            }else{
                if(pr.size()==0)System.out.println(-1);
                else System.out.println(pr.peek());
            }
        }
    }
}
