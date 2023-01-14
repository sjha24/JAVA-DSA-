import java.util.Scanner;

// package rotateLeft;

public class b {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortZero1(arr);
        //print
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortZero1(int arr[]){
        int left = 0;
        int right = 0;
        while(right<arr.length){
            if(arr[right]==1){
                right++;
            }else{
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;right++;
            }
        }
    }
}
