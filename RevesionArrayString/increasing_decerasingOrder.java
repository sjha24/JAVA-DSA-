// import java.security.PublicKey;
import java.util.Scanner;

public class increasing_decerasingOrder {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        printIncreasingDecreasing(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void printIncreasingDecreasing(int arr[]){
        sort(arr);
        int p1 = arr.length/2;
        int p2 = arr.length -1;
        while(p1<p2){
            int temp = arr[p1];
            arr[p1] = arr[p2];
            arr[p2] = temp;
            p1++; p2--;
        }
    }
    public static void sort(int arr[]){
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
