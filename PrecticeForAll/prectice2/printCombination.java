import java.util.Scanner;

public class printCombination {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size  = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        PrintPair(arr,target);
    }
    public static void PrintPair(int[]arr ,int target){
        for(int left = 0 ; left<arr.length; left++){
            for(int right = left; right<arr.length; right++){
                if(arr[left]+arr[right]==target){

                    System.out.print(arr[left]+" "+arr[right]);
                }
            }
        }
    }  
}