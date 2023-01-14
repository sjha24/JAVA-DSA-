import java.util.Scanner;

// package sumOFArr;

public class a {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int ans = sumOFArr(arr);
        System.out.println(ans);
    }
    public static int sumOFArr(int arr[]){
        int sum = 0;
        for(int i = 0; i<arr.length; i++){
            sum = sum+arr[i];
        }
        return sum;
    }
}
