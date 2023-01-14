import java.util.Scanner;

public class a{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = scn.nextInt();
        }
        subArray(arr);
    }
    public static void subArray(int arr[]){
        for(int left = 0; left<arr.length; left++){
            for(int right = left; right<arr.length; right++){
                for(int i = left; i<=right; i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
    }
}