import java.util.Scanner;

// package printPair;

public class findPair {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        findPair(arr, target);
    }
    public static void findPair(int arr[], int target){
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+" "+arr[j]);
                }
            }
        }
    }
}

