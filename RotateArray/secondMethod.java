import java.util.Scanner;

public class secondMethod {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        //input----
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int N = arr.length;
        int k = scn.nextInt();
        k = k % arr.length;
        rotateArr(arr, 0 , N-k-1);
        rotateArr(arr, N-k , N-1);
        rotateArr(arr, 0 , N-1);
        //print--
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void rotateArr(int[]arr, int left , int right){
        while(left<right){
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;right--;
        }
    }
}
