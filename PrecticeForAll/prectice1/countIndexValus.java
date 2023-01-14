import java.util.Scanner;

public class countIndexValus{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        //input----
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        indexValue(arr);
    }
    public static void indexValue(int [] arr){
        int count = 0;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]==i){
                count++;
            }
        }
        System.out.print(count);
    }
}