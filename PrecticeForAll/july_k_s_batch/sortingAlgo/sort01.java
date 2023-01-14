import java.util.Scanner;

public class sort01 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sortArr01(arr);
        for(int i = 0; i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArr01(int arr[]){
        int left = 0;
        int right = arr.length-1;
        while(left<=right){
            if(arr[left]>arr[right]){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;right--;
            }else if(arr[left]<arr[right]){
                left++;
            }else if(arr[right] == 1 && arr[left]==arr[right]){
                right--;
            }else if(arr[left]==0 && arr[left]==arr[right]){
                left++;
            }
        }
    }
}