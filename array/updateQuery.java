import java.util.Scanner;

public class updateQuery {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i<n; i++){
            arr[i] = scn.nextInt();
        }
        int left = scn.nextInt();
        int right = scn.nextInt();
        int num = scn.nextInt();
        UpdateQ(arr, left, right, num);
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void UpdateQ(int arr[], int left, int right, int num){
        for(int i = left ; i<= right; i++){
            arr[i] = num;
        }
    }
}
