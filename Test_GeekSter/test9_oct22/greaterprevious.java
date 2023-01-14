import java.util.Scanner;

public class greaterprevious {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0 ; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        previousTwoGreayerEle(arr);
    }
    public static void previousTwoGreayerEle(int[]arr){
        int count = 0;
        for(int i = 0;i<arr.length-1; i++){
            if(arr[i+1]>arr[i]){
                count++;
            }
        }
        System.out.println(count);
    }
}
