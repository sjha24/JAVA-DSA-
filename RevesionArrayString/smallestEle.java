import java.util.Scanner;

public class smallestEle{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0; i<num; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(findMinimumEle(arr));
    }
    public static int findMinimumEle(int arr[]){
        int mini = Integer.MAX_VALUE;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i]<mini){
                mini = arr[i];
            }
        }
        return mini;
    }
}