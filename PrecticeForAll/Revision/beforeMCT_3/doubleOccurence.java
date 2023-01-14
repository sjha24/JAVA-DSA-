import java.util.HashMap;
import java.util.Scanner;

public class doubleOccurence {
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
        HashMap<Integer ,Integer>hm = new HashMap<>();
        for(int i = 0; i<a2.length; i++){
              hm.put(hm.getOrDefault, null) = hm.getOrDefault(a2[i], 1);
        }
        // for(int i = 0; i<a2.length-1; i++){
        //     if(a2[i]==a2[i+1]){
        //     System.out.print(a1[i]+" ");
        //     }
        // }
        
        // System.out.println(count);
    }

}
