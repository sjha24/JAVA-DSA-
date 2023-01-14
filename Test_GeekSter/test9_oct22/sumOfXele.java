import java.util.Scanner;

public class sumOfXele{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[]arr = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int X = scn.nextInt();
        System.out.print(sumOfArr(arr, X,N));
    }
    public static int sumOfArr(int[]arr, int X, int N){
        int sum = 0;
        for(int i = arr[X]; i<arr[N]-1; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
}