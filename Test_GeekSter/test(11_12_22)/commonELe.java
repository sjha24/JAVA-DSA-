import java.io.*;
import java.util.*;
public class commonELe {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<String> arr1 = new ArrayList<>();
        for(int idx = 0 ; idx < n ; idx++){
            arr1.add(scn.next());
        }
        int m = scn.nextInt();
        ArrayList<String> arr2 = new ArrayList<>();
        for(int idx = 0 ; idx < m ; idx++){
            arr2.add(scn.next());
        }
        arr1.retainAll(arr2);
        for(String val : arr1){
            System.out.print(val+" ");
        }
    }
}
