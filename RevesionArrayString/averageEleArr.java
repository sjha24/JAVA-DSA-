import java.util.Scanner;

public class averageEleArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i =0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        double ans = averageArr(arr);
        System.out.format("%.2f",ans);
    }
    public static double averageArr(int arr[]){
        double sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        double average = sum /arr.length;
        return average;
    }
}
