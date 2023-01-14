import java.util.Scanner;

// package insertionSort;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        insertionSort(arr);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int left = 1; left <arr.length; left++){
            for(int right = left -1; right>=0;right--){
                if(arr[right]>arr[right+1]){
                    int temp = arr[right];
                    arr[right] = arr[right+1];
                    arr[right+1] = temp;
                }else break;
            }
        }
    }
}
