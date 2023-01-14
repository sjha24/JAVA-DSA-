import java.util.Scanner;

// package prefixArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int prefix[] = new int[n];
        for(int i = 0;i<n; i++){
            prefix[i] = scn.nextInt();
        }
        int L = scn.nextInt();
        int R = scn.nextInt();
        int res[] = sum(prefix, L, R);
        for(int i = L; i<=R; i++){
            System.out.println(res[i]);
        }
    }
    public static int[] sum(int arr[], int L, int R){
        int res[] = new int[arr.length];
        int sum = 0;
        for(int i = 0 ; i<arr.length; i++){
            sum = sum + arr[i];
            res[i] = sum;
        }
        return res;
    }
}
