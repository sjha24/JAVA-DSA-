import java.util.Scanner;

public class findLargest {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int num = scn.nextInt();
        int arr[] = new int[num];
        for(int i = 0 ; i<num ; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(findMax(arr));
    }
    public static int findMax(int arr[]){
        int maxValue = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxValue){
                maxValue = arr[i];
            }
        }
        return maxValue;
    }
}
