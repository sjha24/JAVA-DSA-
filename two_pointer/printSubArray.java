import java.util.Scanner;

public class printSubArray {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        SubArray(arr);
    }
    public static void SubArray(int[]arr){
        for(int start = 0; start<arr.length;start++){
            for(int end = start; end<arr.length; end++){
                for(int i = start; i<=end; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}
