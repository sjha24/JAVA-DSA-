import java.util.Scanner;

public class countEven{
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args) {
        int size = scn.nextInt();
        int[] arr = new int[size];
        input(arr);
        CountEvenNum(arr);
    }
    public static void input(int[] arr){
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
    }
    public static void CountEvenNum(int[] arr){
        int count = 0;
        for(int i = 0 ; i<arr.length; i++){
            if(arr[i] % 2 ==0){
                count ++;
            }
        }
        System.out.println(count);
    }
}