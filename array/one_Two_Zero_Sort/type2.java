



import java.util.Scanner;

public class type2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int  i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        sortZero12(arr);
        for(int i = 0 ; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortZero12(int[]arr){
        int left = 0 , mid = 0,right = arr.length-1;
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
    public static void swap(int[]arr ,int ele1,int ele2){
        int temp = arr[ele1];
        arr[ele1] = arr[ele2];
        arr[ele2] = temp;
    }
}
