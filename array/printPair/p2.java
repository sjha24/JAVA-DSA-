import java.util.Scanner;

// package printPair;

public class p2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int arr[] = new int[N];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        for(int i = 0; i<arr.length; i++){
            for(int j = i+1; j<arr.length; j++){
                System.out.println(arr[i]+" "+arr[j]);
            }
        }
    }
}
