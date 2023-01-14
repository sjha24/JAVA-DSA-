import java.util.Arrays;
import java.util.Scanner;

// package formLarjestNum;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        //converting form integer to String;
        String ans[] = new String[n];
        for(int i = 0; i<arr.length; i++){
            ans[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(ans);
        for(int i = ans.length-1; i>=0; i--){
            System.out.print(ans[i]+" ");
        }
    }
}
