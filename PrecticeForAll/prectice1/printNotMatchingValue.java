import java.util.Scanner;

public class printNotMatchingValue {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        //input--
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
     
        int[] arr2 = new int[size];
        //input2
        for(int i = 0; i<arr2.length; i++){
            arr2[i] = scn.nextInt();
        }
        int ans =  nonMatchingNum(arr , arr2);
        System.out.println(ans);
    }
    public static int  nonMatchingNum(int[]arr , int[] arr2){
        for(int i = 0; i<arr.length; i++){
            if(arr[i] != arr2[i]){
                return i;
            }
        }
        return -1;
    }
}
