import java.util.Scanner;

public class intMaxFrq{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int[] arr = new int[N];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        System.out.print(maxFrqArr(arr));
    }
    public static int maxFrqArr(int[]arr){
        int maxfrq = Integer.MIN_VALUE;
        for(int i = 0; i<arr.length; i++){
            if(arr[i]>maxfrq){
                maxfrq = arr[i];
            }
        }
        return maxfrq;
    }
}