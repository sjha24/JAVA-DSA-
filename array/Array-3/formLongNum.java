import java.util.Arrays;
import java.util.Scanner;

public class formLongNum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0;i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(longestNum(arr, n));
    }
    public static String longestNum(int arr[],int n){
        String str[] = new String[n];
        for(int i = 0; i<n; i++){
            str[i] = String.valueOf(arr[i]);
        }
        Arrays.sort(str,(a,b)->(b+a).compareTo(a+b));
        StringBuilder s = new StringBuilder();
        for(String val : str){
            s.append(val);
        }
        String ans = s.toString();
        return ans.startsWith("0")? "0" : ans;
    }
}
