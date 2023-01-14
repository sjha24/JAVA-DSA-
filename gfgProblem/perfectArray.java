import java.util.Scanner;

public class perfectArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        // System.out.println(target(arr));
        System.out.println(isPerfect(arr));
    }

    // public static boolean target(int arr[]){
    // for(int i = 0; i<arr.length; i++){
    // if(isPerfect(arr, arr[i])==false)return false;
    // }
    // return true;
    // }
    public static boolean isPerfect(int arr[]) {
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = arr.length - 1; j >= 0; j--) {
        //         if (arr[i] != arr[j]) {
        //             return false;
        //         }
        //     }
        // }
        // return true;
        int left = 0, right = arr.length-1;
        while(left<right){
            if(arr[left] != arr[right]){
                return false;
            }
            left++;right--;
        }
        return true;
    }
}
