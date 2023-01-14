import java.lang.annotation.Target;
import java.util.Scanner;

public class findMe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int a1[] = new int[n];
        for(int i = 0; i<n; i++){
            a1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int a2[] = new int[m];
        for(int i = 0; i<m; i++){
            a2[i] = scn.nextInt();
        }
        for(int i = 0; i<a1.length; i++){
            // System.out.print(a2[i]+" ");
            System.out.println(findMe6(a1, a2[i]));
            if(findMe6(a1, a2[i])==true){
                System.out.print(a1[i]+" ");
            }
        }
        // System.out.print("\");
      
    }
    public static boolean findMe6(int a1[],int target){
        // System.out.print(target+" ");
        for(int i = 0; i<a1.length; i++){
            if(a1[i] == target)return true;
        }
        return false;
    }
}