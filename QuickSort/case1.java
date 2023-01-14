import java.util.Scanner;

public class case1{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        //input
        for(int i =0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sort(arr);
        //print--
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sort(int[] arr){
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