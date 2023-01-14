import java.util.Scanner;

public class facingTheSum{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        System.out.println(FacingTheSum(arr));
    }
    public static int FacingTheSum(int arr[]){
        int count = 1, leftMax = arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]>leftMax){
                count++;
                leftMax = arr[i];
            }
        }
        return count;
    }
}