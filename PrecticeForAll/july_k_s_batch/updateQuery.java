import java.util.ArrayList;
import java.util.Scanner;

public class updateQuery {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        int x = scn.nextInt();
        for(int i = 0; i<=left; i++){
            arr[i]+=x;
        }
        for(int i= right; i<n; i++){
            arr[i] += x;
        }
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
