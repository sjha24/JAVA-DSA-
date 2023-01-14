import java.util.Scanner;

public class r {
    public static void rotateLeft(int array[], int d, int n) {
        for (int i = 0; i < d; i++)
        rotateArr(array, n);
    }

    public static void rotateArr(int array[], int n) {
        int i, temp;
        temp = array[0];
        for (i = 0; i < n - 1; i++)
            array[i] = array[i + 1];
        array[i] = temp;
    }

    public static void main(String args[]) {
        Scanner scn = new Scanner(System.in);

        int size = scn.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }
        int d = scn.nextInt();
        
        int n = arr.length;
        rotateLeft(arr, d, n);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}
