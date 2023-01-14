import java.util.Scanner;

public class findDuplicate {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr  = new int[size];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(FindDuplicate(arr));
    }
    public static boolean FindDuplicate(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int count = check(arr, arr[i]);
            if(count>1){
                return true;
            }
        }
        return false;
    }
    public static int check(int[] arr , int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== target){
                count++;
            }
        }
        return count;
    }
}
