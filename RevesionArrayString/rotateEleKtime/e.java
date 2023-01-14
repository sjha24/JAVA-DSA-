import java.util.Scanner;

public class e {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        rotateLeft(arr);

    }
    public static void rotateLeft(int arr[]){
        int n = arr.length;
        int temp = arr[0];
        arr[1] = arr[0];
        arr[n-1] = temp;
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}
