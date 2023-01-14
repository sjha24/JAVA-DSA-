import java.util.ArrayList;
import java.util.Scanner;

public class c {
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
        ArrayList<Integer> res = merge(a1,a2);
        for(int val : res){
            System.out.println(val+" ");
        }
    }
    public static ArrayList<Integer> merge(int a1[], int a2[]){
        ArrayList<Integer> ans = new ArrayList<>();
        int p1 = 0, p2 = 0;
        while(p1<a1.length && p2<a2.length){
            if(a1[p1]<a1.length){
                if(ans.size()==0 || ans.get(ans.size()-1)==a1[p1])
                ans.add(a1[p1]);
                p1++;
            }else{
                if(ans.size()==0 || ans.get(ans.size()-1)==a2[p2])
                ans.add(a2[p2]);
                p2++;
            }
        }
        while(p1<a1.length){
            if(ans.size()==0 || ans.get(ans.size()-1)==a1[p1])
            ans.add(a1[p1]);
            p1++;
        }
        while(p2<a2.length){
            if(ans.size()==0 || ans.get(ans.size()-1)==a2[p2])
            ans.add(a2[p2]);
            p2++;
        }
        return ans;
    }
}
