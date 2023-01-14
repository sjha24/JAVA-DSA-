import java.util.ArrayList;
import java.util.Scanner;

// package mergerTwoSort;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0;i<arr1.length; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[m];
        for(int i = 0;i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        ArrayList<Integer> res = merge(arr1,arr2);
        for(int val : res){
            System.out.print(val+" ");
        }
    }
    public static ArrayList<Integer> merge(int arr1[], int arr2[]){
        int p1 = 0; int p2 = 0;
        ArrayList<Integer> res = new ArrayList<>();
        while(p1<arr1.length && p2<arr2.length){
            if(arr1[p1]<=arr2[p2]){
                if(res.size() == 0 || res.get(res.size()-1 )!= arr1[p1])
                res.add(arr1[p1]);
                p1++;
            }else{
                if(res.size()==0 || res.get(res.size()-1) != arr2[p2])
                res.add(arr2[p2]);
                p2++;
            }
        }
        while(p1<arr1.length){
            if(res.size() == 0 || res.get(res.size()-1 )!= arr1[p1])
                res.add(arr1[p1]);
                p1++;
        }
        while(p2<arr2.length){
            if(res.size()==0 || res.get(res.size()-1) != arr2[p2])
            res.add(arr2[p2]);
            p2++;
        }
        return res;
    }
}
