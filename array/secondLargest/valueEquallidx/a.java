import java.util.ArrayList;
import java.util.Scanner;

// package valueEquallidx;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(valueEquallidx(arr,n));
    }
    public static ArrayList<Integer> valueEquallidx(int arr[], int n){
        ArrayList<Integer>idx = new ArrayList<>();
        for(int i = 0; i<arr.length; i++){
            // System.out.print(arr[i]+" ");
            if(arr[i]==i+1){
                idx.add(i+1);
                continue;
            }
        }
        return idx;
    }
}
