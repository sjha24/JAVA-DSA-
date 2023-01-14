import java.util.Scanner;

public class printPair {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size  = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        PrintPair(arr);
    }
    public static void PrintPair(int[]arr){
        for(int left = 0 ; left<arr.length; left++){
            for(int right = left +1; right<arr.length; right++){
                System.out.print(arr[left]+" "+arr[right]);
            }
        }
    }
}
