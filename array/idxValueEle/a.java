import java.util.Scanner;

// package idxValueEle;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(idxValueEle(arr));
    }
    public static int idxValueEle(int arr[]){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(i == arr[i])count++;
        }
        return count;
    }
}
