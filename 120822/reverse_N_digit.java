import java.util.Scanner;

public class reverse_N_digit {
    public static Scanner scn = new Scanner(System.in);
    public static void main(String[] args){
        int N = scn.nextInt();
        int[] arr = new int[N];
        input_arr(arr);
        print(arr);
        Reverse_num(arr);
        print(arr);
    }
    public static void input_arr(int[] arr){
        for(int i = 0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
    }
    
    public static void Reverse_num(int[] arr){
        int[] copy = new int[arr.length];
        int j = 0;
        for(int i = arr.length-1; i>=0;i--){
            copy[j] = arr[i];
            j++;
        }
        for(int i = 0 ; i<arr.length;i++){
            arr[i] = copy[i];
        }
    }
    public static void print(int[] arr){
        for(int i = 0 ; i<arr.length;i++){
            System.out.print(arr[i]);
        }
        System.out.println();
    }

}
