import java.util.Scanner;

public class selectionSort {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        SelectionSortAlgo(arr);
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void SelectionSortAlgo(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            int mindIdx = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[mindIdx]) {
                    mindIdx = j;
                }
            }
            
            int temp = arr[mindIdx];
            arr[mindIdx] = arr[i];
            arr[i] = temp;
        }
    }
}
