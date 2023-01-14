import java.util.Scanner;

public class sort976 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        sortArr(arr);
    }

    public static void sortArr(int[] arr) {
        int count1 = 0, count2 = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 9)
                count1++;
            if (arr[i] == 6)
                count2++;
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < count1; j++) {
                arr[j] = 9;
            }
            for(int k = 0; k<count2; k++){
                arr[k] = 7;
            }
            arr[i] = 6;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}