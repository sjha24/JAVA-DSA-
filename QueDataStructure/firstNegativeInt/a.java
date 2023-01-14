import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

// package firstNegativeInt;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        Queue<Integer>q = new ArrayDeque<>();
        int right = 0, left = -k;
        while(right<n){
            //include the right ele
            if(arr[right]<0){
                q.add(arr[right]);
            }
            if(left>=0 && arr[left]<0){
                q.remove();
            }
            left++;right++;
            if(left<0)continue;
            if(q.size()==0)System.out.print(0+" ");
            else System.out.print(q.peek()+" ");
        }
    }
}
