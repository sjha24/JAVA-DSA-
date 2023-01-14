import java.util.Scanner;

public class graterAtRight{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        printGreaterAtRight(arr);
    }
    public static int couuntGreater(int[]arr,int target,int R){
        int count = 0;
        for(int i =R+1; i<arr.length; i++){
           if(arr[i]>target){
            count++;
           }
        }
        return count;
    }
    public static void printGreaterAtRight(int[] arr){
        for(int R = 0; R<arr.length; R++){
            int count = couuntGreater(arr, arr[R],R);
            System.out.print(count+" ");
        }
    }
}