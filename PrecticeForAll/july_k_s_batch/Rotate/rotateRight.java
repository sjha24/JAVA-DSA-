import java.util.Scanner;

public class rotateRight {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        int r = scn.nextInt();
        int k = r%n;
        rotate(arr, 0, n-k-1);
        rotate(arr, n-k, n-1);
        rotate(arr, 0, n-1);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotate(int arr[], int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
}