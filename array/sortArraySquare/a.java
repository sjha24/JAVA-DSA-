import java.util.Scanner;

// package sortArraySquare;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[]  = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortArraySquare(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static int[] sortArraySquare(int arr[]){
        int ans[] = new int[arr.length];
        int left = 0, right = arr.length-1, idx = arr.length-1;
        while(left<=right){
            if(arr[left] * arr[left]>=arr[right]*arr[right]){
                ans[idx] = arr[left]*arr[left];
                left++;
                idx--;
            }else{
                ans[idx] = arr[right]*arr[right];
                right--;
                idx--;
            }
        }
        return ans;
    }
}
