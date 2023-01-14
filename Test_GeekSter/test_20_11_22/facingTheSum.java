import java.util.Arrays;
import java.util.Scanner;

public class facingTheSum {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int height = scn.nextInt();
        int arr[] = new int[height];
        for(int i = 0;i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        numOfBuldingFacingTheSun(arr);
    }
    public static void numOfBuldingFacingTheSun(int arr[]){
        int count = 1 , LeftMax = arr[0];
        for(int i =0;i<arr.length; i++){
                if(arr[i]>LeftMax){
                    count++;
                    LeftMax = arr[i];
                }
        }
        System.out.println(count);
    }
}
