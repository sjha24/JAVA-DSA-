import java.util.Scanner;

public class sumEqual_Zero{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(sumEqualZero(arr,0));
    }
    public static boolean  sumEqualZero(int[]arr, int target){
        for(int start = 0; start<arr.length;start++){
            int sum = 0;
            for(int end = start; end<arr.length; end++){
                sum = sum + arr[end];
            }
            if(sum==target){
                return true;
            }
        }
        return false;
    }
}