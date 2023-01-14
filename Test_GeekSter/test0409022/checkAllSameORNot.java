import java.util.Scanner;

public class checkAllSameORNot{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[] arr = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(checkSameArray(arr));
    }
   
    public static int check(int[] arr , int target){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]== arr[target]){
                count++;
            }
        }
        return count;
    }
    public static String checkSameArray(int[] arr){
        for(int i = 0; i<arr.length; i++){
            int count = check(arr, arr[i]);
            if(count==arr.length){
                return "True";
            }
        }
        return "False";
    }
}