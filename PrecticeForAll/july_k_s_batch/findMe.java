import java.util.LinkedHashSet;
import java.util.Scanner;
//not correct ans;
public class findMe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i = 0; i<n; i++){
            arr1[i] = scn.nextInt();
        }
        int m = scn.nextInt();
        int arr2[] = new int[n];
        for(int i = 0; i<n; i++){
            arr2[i] = scn.nextInt();
        }
        LinkedHashSet<Integer>uniq = new LinkedHashSet<>();
        for(int i = 0; i<n; i++){
            uniq.add(arr1[i]);
        }
        for(int i = 0; i<m; i++){
            uniq.add(arr2[i]);
        }
        for(int val : uniq){
            System.out.print(val+" ");
        }
    }
}