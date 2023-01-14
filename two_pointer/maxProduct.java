import java.util.Scanner;


public class maxProduct {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int[]arr = new int[size];
        for(int i = 0; i<arr.length;i++){
            arr[i] = scn.nextInt();
        }
        Max_Product(arr);
    }
    public static void Max_Product(int[]arr){
        int Max = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>Max){
                Max = arr[i];
            }
            System.out.println(Max);
        }
    }
}

