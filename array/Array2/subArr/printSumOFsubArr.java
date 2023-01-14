import java.util.Scanner;

// package subArr;

public class printSumOFsubArr {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        printSumOFsubArray(arr);
    }
    public static void printSumOFsubArray(int arr[]){
        for(int st = 0; st<arr.length; st++){
            int sum = 0;
            for(int end = st; end<arr.length; end++){
                sum = sum +arr[end];
            }
            System.out.println(sum);
        }
    }
}
