import java.util.Arrays;
import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        String str[] = new String[n];
        for(int i = 0; i<arr.length; i++){
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str);
        for(int i = str.length -1 ; i>=0; i--){
            System.out.print(str[i]);
        }
        
    }
}