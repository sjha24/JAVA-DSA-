import java.util.Scanner;

// package addOne;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans[] = addOne(arr);
        for(int i = 0; i<ans.length; i++){
            System.out.print(ans[i]+" ");
        }
    }
    public static int[] addOne(int arr[]){
        int i;
        for(i = arr.length-1 ; i>=0 && arr[i]==9 ; i--){
            arr[i] = 0;
        }
        if(i == -1){
            int ans[] = new int[arr.length+1];
            ans[0] = 1;
            return ans;
        }
        arr[i]++;
        return arr;
    }
}
