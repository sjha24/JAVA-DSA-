import java.util.Scanner;

// package nonMatchingArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int n2 = scn.nextInt();
        int arr2[] = new int[n2];
        for(int i = 0; i<n2; i++){
            arr2[i] = scn.nextInt();
        }
        System.out.println(print1stNonMatchingNo(arr, arr2));
    }
    public static int print1stNonMatchingNo(int arr[], int arr2[]){
        for(int i = 0; i<arr.length ; i++){
            if(arr[i] != arr2[i])return i;
        }
        return -1;
    }
}
