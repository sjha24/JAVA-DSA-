import java.util.*;
public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        insertionSortAlgo(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSortAlgo(int arr[]){
        for(int left = 1; left<arr.length; left++){
            for(int right = left-1;right>=0;right--)
            if(arr[right]>arr[right+1]){
                int temp = arr[right];
                arr[right] = arr[right+1];
                arr[right+1] = temp;
            }else break;
        }
    }
}
