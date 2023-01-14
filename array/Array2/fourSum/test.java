 java.util.Scanner;

public class test {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    int arr[] = new int[n];
    for(int i = 0; i<arr.length; i++){
        arr[i] = scn.nextInt();
    }
    for(int j = 0; j<arr.length; j++){
        int left = 0, right = 0;
        for(int K = 0; K<j; K++){
            left += arr[k];
        }
    }
}
