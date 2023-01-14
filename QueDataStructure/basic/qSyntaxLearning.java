import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class qSyntaxLearning {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Queue<Integer>q = new ArrayDeque<>();
        int T = scn.nextInt();
        while(T-- >0){
            int option = scn.nextInt();
            if(option==1){
                System.out.println(q.size());
            }else if(option==2){
                if(q.isEmpty())System.out.println("-1");
                else q.remove();
            }else if(option==3){
                int x = scn.nextInt();
                q.add(x);
            }else if(option==4){
                if(q.isEmpty())System.out.println("-1");
                else System.out.println(q.peek());
            }
        }
    
    }
}
