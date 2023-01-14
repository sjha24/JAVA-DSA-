// package breakStone;

import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        PriorityQueue<Integer>pr = new PriorityQueue<>(Collections.reverseOrder());
        int n = scn.nextInt();
        for(int i = 0; i<n; i++){
            int x = scn.nextInt();
            pr.add(x);
        }
        while(pr.size()>1){
            int top1 = pr.remove();
            int top2 = pr.remove();
            if(top1>top2){
               pr.add(top1-top2);
            }
        }
        if(pr.size()==0)System.out.println(0);
        else System.out.println(pr.peek());
    }
}
