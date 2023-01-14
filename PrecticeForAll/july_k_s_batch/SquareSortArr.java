import java.util.Scanner;

public class SquareSortArr{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        sortArr(arr);
        for(int i = 0; i<n; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void sortArr(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length-1; j++){
                if(arr[j]*arr[j]>arr[j+1]*arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }
}