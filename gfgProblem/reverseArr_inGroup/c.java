import java.util.ArrayList;
import java.util.Scanner;

public class c {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        ArrayList<Integer>arr = new ArrayList<>();
        int t = scn.nextInt();
        for(int i = 0; i<t; i++){
            int val = scn.nextInt();
            arr.add(val);
        }
        int k = scn.nextInt();
        reverseArr_inGroup(arr,t, k);
        for(int i = 0;i<arr.size(); i++){
            System.out.print(arr.get(i)+" ");
        }
    }
    public static void reverseArr_inGroup(ArrayList<Integer>arr, int n, int k){
        for (int i = 0; i < n; i += k) { 
            if(i+k < n){ 
                swap(arr,n,i,i+k-1);
            }
            else{
                swap(arr,n,i,n-1);
            }
        }
    }
    public static void swap(ArrayList<Integer>arr,int n, int left, int right){
        while(left<right){
            int temp = arr.get(left);
            arr.set(left,arr.get(right));
            arr.set(right, temp);
            left++;right--;
        }
    }
}
