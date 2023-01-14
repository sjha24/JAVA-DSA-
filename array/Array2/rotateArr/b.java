import java.util.Scanner;

// package rotateArr;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int k = scn.nextInt();
        k = k %n;
        rotateArr(arr, 0, n-k-1);
        rotateArr(arr, n-k, n-1);
        rotateArr(arr, 0, n-1);
        for(int i = 0;i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }

    }
    public static void rotateArr(int arr[], int left, int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;

        }
    }
}
