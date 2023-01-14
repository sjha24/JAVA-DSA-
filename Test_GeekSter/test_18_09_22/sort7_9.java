import java.util.Scanner;

public class sort7_9{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortArr(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArr(int[]arr){
        int left = 0,mid =0, right = arr.length-1;
        while(left<=right){
            if(arr[left]==9){
                left++;
            }else if(arr[left]==7){
                swap(arr, left, right);
                right--;
            }
        }
    }
    public static void swap(int[]arr ,int ele1,int ele2){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
    
}