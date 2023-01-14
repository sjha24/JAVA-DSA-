import java.util.Scanner;

import javax.lang.model.element.Element;

// package findDuplicate;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(findDuplicate(arr));
    }
    public static boolean findDuplicate(int arr[]){
        for(int i = 0; i<arr.length; i++){
            int count = getFrq(arr, arr[i]);
            if(count>1)return true;
        }
        return false;
    }
    public static int getFrq(int arr[], int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==target)count++;
        }
        return count;
    }
}
