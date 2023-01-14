
// import java.util.HashMap;
// import java.util.Scanner;
import java.util.*;

public class equallStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        char ch[] = new char[n];
        for(int i = 0;i<n; i++){
            ch[i] = scn.next().charAt(0);
        }
       
    }
    public static int EquallStack(){
        int ht1 = 0,ht2 = 0, ht3 = 0;
    for(int cyl : h1){
      ht1+=cyl;
    }
    for(int cyl : h2){
      ht2+=cyl;
    }
    for(int cyl : h3){
      ht3+=cyl;
    }
    int t1 =0,t2= 0,t3=0;
     while(ht1 != 0 && ht2 !=0 && ht3 != 0){
       if(ht1 == ht2 && ht2 == ht3){
         return ht1;
       }
      if(ht1 >= ht2 && ht1>=ht3){
        ht1 -= h1.get(t1++);
      }else if(ht2>=ht1 && ht2>=ht3){
        ht2 -= h2.get(t2++);
      }else if(ht3>=ht1 && ht3>=ht2){
        ht3 -= h3.get(t3++);
     }
    }
    return 0;
    }

}

}}
