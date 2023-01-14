import java.util.Scanner;

public class sort012 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sortArr012(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArr012(int arr[]){
        int left = 0,mid = 0, right = arr.length-1;
        while(mid<=right){
            if(arr[mid]==0){
                swap(arr, left, mid);
                left++;mid++;
            }else if(arr[mid]==1){
                mid++;
            }else{
                swap(arr, mid, right);
                right--;
            }
        }
    }
    public static void swap(int arr[],int left,int right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp; 
    }
}
