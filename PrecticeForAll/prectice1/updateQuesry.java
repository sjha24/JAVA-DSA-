import java.util.Scanner;

public class updateQuesry {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        int target = scn.nextInt();
        printArray(arr,left,right,target);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printArray(int[] arr,int left, int right, int target){
        for(int i = left; i<=right; i++){
            arr[i] = target;
        }
    }
}
