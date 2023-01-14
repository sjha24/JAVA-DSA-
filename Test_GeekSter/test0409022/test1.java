import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(areSame(arr));
    }
    public static boolean areSame(int[] arr){
        int target = arr[0];
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] != target){
                return false;
            }else if(arr[i]<0){
                return true;
            }
        }
        return true;
    }
}
