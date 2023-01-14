import java.util.Arrays;
import java.util.Scanner;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        int arr[] = new int[n];
        for(int i = 0;i<n;i++){
            arr[i] = scn.nextInt();
        }
        Arrays.sort(arr);
        int ans[] = printUniqueNum(arr);
        for(int i = 0; i<ans.length; i++){
            if(ans[i]>0){
                System.out.print(ans[i]+" ");
                return;
            }
        }
        if(arr.length == 0){
            System.out.println(-1);
        }
    }

    public static int[] printUniqueNum(int[] arr) {

        int[] res = new int[arr.length];
        int count = 1;
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                res[count] = arr[i];
                count++;
            } else {
                if (arr[i] != arr[i - 1]) {
                    res[count] = arr[i];
                    count++;
                }
            }
        }
        return res;
    }
}
