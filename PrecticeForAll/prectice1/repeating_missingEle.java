// import java.lang.annotation.Target;
import java.util.Scanner;

public class repeating_missingEle {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        //input--
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 1; i<=size; i++){
            if(isRepeatEle(arr,i)==true){
                System.out.println(i);
            }
        }
        for(int i = 1; i<=size; i++){
            if(isMissingEle(arr ,i)==true){
                System.out.println(i);
            }
        }
            
    }
    public static boolean isMissingEle(int[] arr , int target){
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] == target){
                return false;
            }
        }
        return true;
        
    }
    public static boolean isRepeatEle(int[]arr , int target) {
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i] == target){
                count++;
            }
        }
        if(count==2){
            return true;
        }
        return false;
    }
}
