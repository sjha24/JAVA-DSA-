import java.util.ArrayList;
import java.util.Scanner;

// package firstLaatOccurance;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        long arr[] = new long[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        int x = scn.nextInt();
        ArrayList<Long>res = find(arr, n, x);
        for(int i = 0;i<res.size(); i++){
            System.out.print(res.get(i)+" ");
        }
    }

    public static ArrayList<Long> find(long arr[], int n, int x)
    {
        // code here
        ArrayList<Long>res = new ArrayList<>();
        boolean flag = false;
        for(int i = 0; i<n; i++){
            if(arr[i] == x){
                flag = true;
                res.add(Long.valueOf(i));
                break;
            }
        }
        flag = false;
        for(int i = n-1; i>=0; i--){
            if(arr[i] ==x){
                flag = true;
                res.add(Long.valueOf(i));
                break;
            }
        }
        if(flag == false){
            res.add(Long.valueOf(-1));
            res.add(Long.valueOf(-1));
        }
        return res;
    }

}
