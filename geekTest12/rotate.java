import java.util.Scanner;

public class rotate {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int size = scn.nextInt();
        int arr[] = new int[size];
        for(int i = 0; i<size; i++){
            arr[i] = scn.nextInt();
        }
        int n = arr.length;
    
        int d = scn.nextInt();

        rotateArr(arr, d, n);
          for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void rotateArr(int arr[], int d, int n){
        int K = 1;
        while (K <= d) {
            int last = arr[0];
            for (int i = 0; i <n-1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = last;
            K++;
        }
    }
}
